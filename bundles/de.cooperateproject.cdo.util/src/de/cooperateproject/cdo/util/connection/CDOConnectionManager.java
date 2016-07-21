package de.cooperateproject.cdo.util.connection;

import org.apache.commons.lang3.RandomStringUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository;
import org.eclipse.emf.cdo.session.CDOSession;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import de.cooperateproject.cdo.util.utils.CDOHelper;

public enum CDOConnectionManager {

	INSTANCE;
	
	public static CDOConnectionManager getInstance() {
		return INSTANCE;
	}
	
	private final BiMap<CDORepository, IProject> repositories = HashBiMap.create(); 
	private final BiMap<CDORepository, CDOSession> sessions = HashBiMap.create();
	
	public void register(IProject project, CDOConnectionSettings settings) {
		if (!repositories.inverse().containsKey(project)) {
			CDOHelper.deleteRepositoryFor(project);
			CDORepository repo = CDOHelper.createRepositoryFor(project, settings);
			repositories.put(repo, project);		
		}
	}
	
	public void unregister(IProject project) {
		CDORepository repository = repositories.inverse().get(project);
		if (repository == null) {
			return;
		}
		CDOHelper.delete(repository);
		sessions.remove(repository);
		repositories.remove(repository);
	}
	
	public CDOSession acquireSession(IProject project) {
		CDORepository repository = getRepository(project);
		CDOSession session = repository.acquireSession();
		sessions.put(repository, session);
		return session;
	}
	
	public void releaseSession(CDOSession session) {
		CDORepository repository = sessions.inverse().get(session);
		if (repository == null) {
			// log
		} else {
			repository.releaseSession();
		}
	}
	
	public CDOCheckout createCDOCheckout(IProject project, boolean createBranch) {
		CDORepository repository = getRepository(project);
		CDOSession session = acquireSession(project);
		try {
			int branchId = 0;
			if (createBranch) {
				CDOBranch newBranch = session.getBranchManager().getMainBranch().createBranch(createRandomBranchName());
				branchId = newBranch.getID();
			}
			return CDOHelper.createCheckout(repository, branchId);			
		} finally {
			releaseSession(session);
		}
	}
	
	public void deleteCDOCheckout(CDOCheckout checkout) {
		CDOHelper.delete(checkout);
	}
	
	private CDORepository getRepository(IProject project) throws IllegalStateException {
		CDORepository repository = repositories.inverse().get(project);
		if (repository == null) {
			throw new IllegalStateException("This project has not been registered yet.");
		}
		return repository;
	}
	
	private static String createRandomBranchName() {
		return String.format("z_cooperate_%s_%s", System.currentTimeMillis(), RandomStringUtils.randomAlphanumeric(2));
	}

}
