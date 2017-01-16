package de.cooperateproject.ui.diff.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.commit.CDOCommitHistory;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfoManager;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.revision.CDOIDAndVersion;
import org.eclipse.emf.cdo.compare.CDOCompareUtil;
import org.eclipse.emf.cdo.compare.CDOComparisonScope;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.uml2.uml.PrimitiveType;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.ui.constants.UIConstants;
import de.cooperateproject.ui.editors.launcher.extensions.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.util.ConversionUtils;

/**
 * Provides functions for receiving information about commits from a resource
 * @author Jasmin
 *
 */
public class CommitManager {
	
		private IFile currentFile;
		private DiffTreeItem root;
		private Map<CDOCommitInfo, Set<CDOID>> cdoIds = new HashMap<CDOCommitInfo, Set<CDOID>>(); //contains the IDs of all changed objects during all found commits of the file
		private Set<CommitInfo> commitInfos = new HashSet<CommitInfo>();
		private String resourceDiagramPath;
		
		/**
		 * Returns all commits as text representation found in CDO Repository from the current file.
		 * @return
		 */
		public Set<CommitInfo> getAllCommitInfos(){
			
			if(currentFile != null && cdoIds.size() <= 0){
				findAllCommits();
			}
			Iterator<CDOCommitInfo> it = cdoIds.keySet().iterator();
			
			while(it.hasNext()){
				CDOCommitInfo cdoInfo = it.next();
				CommitInfo info = new CommitInfo(cdoInfo, cdoIds.get(cdoInfo).size());
				commitInfos.add(info);
			}
			return commitInfos;
			
		}

		/**
		 * Returns all commits until the given date as text representation found in CDO Repository from the current file.
		 * @param date: the given date in milliseconds
		 */
		public Set<CommitInfo> getAllCommitInfos(long dateMillis){

			if(currentFile != null && cdoIds.size() <= 0){
				getAllCommitInfos();
			}
		
			Set<CommitInfo> commitInfosTemp = new HashSet<CommitInfo>();
			Calendar today = Calendar.getInstance();
			long current_timestamp = today.getTimeInMillis();

			Iterator<CDOCommitInfo> it = cdoIds.keySet().iterator();
			
			while(it.hasNext()){
				CDOCommitInfo cdoInfo = it.next();
				if(cdoInfo.getTimeStamp() >= dateMillis && cdoInfo.getTimeStamp() <= current_timestamp){
					CommitInfo info = new CommitInfo(cdoInfo, cdoIds.get(cdoInfo).size());
					commitInfosTemp.add(info);
				}
			}
				
			return commitInfosTemp;
		}
		
		/**
		 * Computes the comparison of the commit and returns it
		 * @param commit the commit to be compared to its old version
		 * @return a list with objects which respectively carry the two matched objects from EMF Compare
		 */
		public List<SummaryItem> compare(CommitInfo commit){
			List<SummaryItem> sumList = new ArrayList<SummaryItem>();
			CDOCommitInfo cdoInfo = commit.getCDOCommitInfo();
			CDOSession session = CDOConnectionManager.getInstance().acquireSession(currentFile.getProject());
			CDOBranch mainBranch = session.getBranchManager().getMainBranch();
			
			CDOView previousState = session.openView(mainBranch, cdoInfo.getPreviousTimeStamp());
			CDOView currentState = session.openView(mainBranch, cdoInfo.getTimeStamp());

			IComparisonScope scope = CDOComparisonScope.Minimal.create(currentState, previousState, null, cdoIds.get(cdoInfo));
       	  	Comparison comparisonResult = CDOCompareUtil.compare(scope);	
       	  	EList<Diff> resultList = comparisonResult.getDifferences();

       	  	CommentLinkAdapt.setCDOView(currentState);
       	  	
       	  	for(int i = 0; i < resultList.size(); i++){
       	  		EObject value = getValue(resultList.get(i));
	       	  	if(value != null){
	       	  		if(comparisonResult.getMatch(value) != null || value instanceof EAttribute || value instanceof PrimitiveType){
	       	  			Object left = null;
	       	  			Object right = null;
	       	  			EObject parent = resultList.get(i).getMatch().getLeft();
	       	  			
	       	  			if(value instanceof CommentLink){
	       	  				parent = CommentLinkAdapt.findParent((CommentLink)value);	
	       	  			}
	       	  			
	       	  			if(parent == null) break; //don't add a summary item that has no parent class
	       	  			
	       	  			switch(resultList.get(i).getKind()){
	       	  				case DELETE: 
	       	  					right = value; break;
	       	  				case ADD:
	       	  					left = value; break;
	       	  			 	default: 
	       	  			 		left = value;
	       	  			 		if(resultList.get(i).getMatch().getRight() != null){
	       	  			 			right = getOldValue(resultList.get(i), comparisonResult, value);
	       	  			 		}

	       	  			}
	       	  			sumList.add(new SummaryItem(left, right, parent, resultList.get(i).getKind()));
	       	  		}
	       	  	}	
	       	}
       	  	CDOResource resourceOnCurrentView = currentState.getResource(resourceDiagramPath);
       	  	
       	  	setRoot(new DiffTreeBuilder(resourceOnCurrentView, sumList).buildTree());
       	  	CDOConnectionManager.getInstance().releaseSession(session);
       	  	return sumList;
       	  				
		}
		
		private void findAllCommits(){
			IProject project = currentFile.getProject();
			CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
			try {
				CDOView view = session.openView();
				try {
					
					CDOBranch mainBranch = session.getBranchManager().getMainBranch();
			        ConcreteSyntaxModel textmodel = null;
			        Diagram launcherModel = null;
			            
			        try{
			         launcherModel = loadDiagram(view, currentFile);
					 textmodel = selectConcreteSyntaxModel(launcherModel, EditorType.TEXTUAL);
					 resourceDiagramPath = CDOURIUtil.extractResourcePath(EcoreUtil.getURI(textmodel.getRootElement()));
			        }catch(Exception e){}
			        
			        CDOObject txtRoot = CDOUtil.getCDOObject(textmodel.getRootElement());
			        CDOResource resource = txtRoot.cdoResource();	        
			        CDOID resourceCDOId = resource.cdoID();
			        long firstCommitTimeStamp = view.getRevision(resourceCDOId).getTimeStamp();

					//get all commits from main branch
			        CDOCommitInfoManager commitManager = session.getCommitInfoManager();
			        CDOCommitHistory mainHistory = commitManager.getHistory(mainBranch);
			        for (int i = 0; i < mainHistory.size(); i++) {
			        	CDOCommitInfo commitInfo = mainHistory.getElement(i);
			        	if (commitInfo.getTimeStamp() < firstCommitTimeStamp) {
			        		break;
			        	}
			        	
						 if (commitInfo.getPreviousTimeStamp() == CDOCommitInfo.INVALID_DATE) {
							 return;
		             	  }
						 
						 CDOCommitInfo previousCommitInfo = mainHistory.getElement(i+1);
						 CDOView previousState = session.openView(mainBranch, previousCommitInfo.getTimeStamp());
			          	 CDOView currentState = session.openView(mainBranch, commitInfo.getTimeStamp());
			          	 
			          	 try {
			          		 List<CDOIDAndVersion> changedObjects = Lists.newArrayList(Iterables.concat(commitInfo.getNewObjects(), commitInfo.getDetachedObjects(), commitInfo.getChangedObjects()));
			          		 //Set of all IDs of the objects that have been changed in the two states and hence are of interest
			          		 Set<CDOID> value = changedObjects.stream().filter(object -> parentMatches(object.getID(), resourceCDOId, previousState, currentState)).map(CDOIDAndVersion::getID).collect(Collectors.toSet());
			          		 
			          		 if(value.size() > 0){
			          			 cdoIds.put(commitInfo, value);
			              	}
		  		
			          	 } finally {
			          		 IOUtil.closeSilent(previousState);
			          		 IOUtil.closeSilent(currentState);
			          	 }
			        }
					
				} finally {
					IOUtil.closeSilent(view);
				}
			} finally {
				CDOConnectionManager.getInstance().releaseSession(session);
			}
		}
			
		private void setRoot(DiffTreeItem resource) {
			root = resource;
		}
		public DiffTreeItem getRoot(){
			return root;
		}

		/**
		 * Set the file on which the Commit Manager should work
		 * @param file the file to be set
		 */
		public void setFile(IFile file){
			currentFile = file;
			cdoIds.clear();
			commitInfos.clear();
			root = null;
			resourceDiagramPath = null;
		}

		//TODO: use this from the class where it was first implemented (this is only copy and paste for testing)
	   private Diagram loadDiagram(CDOView cdoView, IFile launcherFile) throws IOException {
	      		
	      	ResourceSet rs = cdoView.getResourceSet();
	      	URI fileUri = URI.createPlatformResourceURI(launcherFile.getFullPath().toString(), true);
	      	Resource r = rs.createResource(fileUri, UIConstants.LAUNCHER_EXTENSION);
	     	r.load(Collections.emptyMap());
	     	EObject rootObject = r.getContents().get(0);
	   		if (!(rootObject instanceof Diagram)) {
	   			throw new IllegalArgumentException("");
      		}
	      		return (Diagram) rootObject;
	      	}
	         
	   //TODO: use this from the class where it was first implemented (this is only copy and paste for testing)
	   private ConcreteSyntaxModel selectConcreteSyntaxModel(Diagram launcherModel,
	    			EditorType editorType) throws ConcreteSyntaxTypeNotAvailableException {
     		Validate.notNull(launcherModel);
     		Validate.notNull(editorType);
	      	
	   		Optional<ConcreteSyntaxModel> model = ConversionUtils.convert(Iterables.tryFind(launcherModel.getConcreteSyntaxModels(), m -> editorType.getSupportedSyntaxModels()
	      				.stream().anyMatch(t -> t.isAssignableFrom(m.getClass()))));
	      		
	   		if (!model.isPresent()) {
      			throw new ConcreteSyntaxTypeNotAvailableException("The concrete syntax type " + editorType + " is not available.");
	      		
	   		}
	   		
	   		
	   		return model.get();
	      	}
	   
	   private boolean parentMatches(CDOID objectId, CDOID parentId, CDOView previousView, CDOView currentView) {
    	   try{
    		   CDOObject object = previousView.getObject(objectId);
    		   return object.cdoResource().cdoID().equals(parentId);
    	   }
    	   catch(Exception e){}
    	   try{
    		   CDOObject object2 = currentView.getObject(objectId);
    		   return  object2.cdoResource().cdoID().equals(parentId);
    	   }catch(Exception e){}
    	   
    	   return false;
       }
	   
	   private EObject getValue(Diff diff) {
	   		EObject value = null;

	   		if (diff instanceof ReferenceChange) {
	   			value = ((ReferenceChange)diff).getValue();
	   		} else if(diff instanceof AttributeChange){
	   			value = ((AttributeChange)diff).getAttribute();
	   		}	
	   		return value;
	   	}
	   
	   @SuppressWarnings("rawtypes")
	private Object getOldValue(Diff diff, Comparison comparisonResult, EObject value){
		   Object oldValue = null;
		   if(diff instanceof AttributeChange){
		 	oldValue =  diff.getMatch().getRight().eGet(((AttributeChange)diff).getAttribute());
		   } else if(diff instanceof ReferenceChange){
			   if(diff.getKind() == DifferenceKind.MOVE){
				   oldValue = comparisonResult.getMatch(value).getRight().eContainer();
			   }
			   else{
				   oldValue = diff.getMatch().getRight().eGet(((ReferenceChange)diff).getReference());
			   }
			}
		 	if(oldValue instanceof org.eclipse.emf.ecore.util.DelegatingEcoreEList){
		 		oldValue = ((org.eclipse.emf.ecore.util.DelegatingEcoreEList)oldValue).getEObject();
		 	}
		 	
		   return oldValue;
	   }
	  

		   
	   
}
