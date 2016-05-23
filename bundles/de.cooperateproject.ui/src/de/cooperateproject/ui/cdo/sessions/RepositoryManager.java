package de.cooperateproject.ui.cdo.sessions;

import java.util.Optional;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.explorer.repositories.CDORepository;
import org.eclipse.emf.cdo.session.CDOSession;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public enum RepositoryManager {

	INSTANCE;
	
	private final BiMap<CDORepository, IProject> repositories = HashBiMap.create(); 
	private final BiMap<CDORepository, CDOSession> sessions = HashBiMap.create();
	
	public static RepositoryManager getInstance() {
		return INSTANCE;
	}
	
	public void register(CDORepository repo, IProject project) {
		repositories.put(repo, project);
	}
	
	public void unregister(CDORepository repo) {
		repositories.remove(repo);
	}
	
	public Optional<CDORepository> getRepository(CDOSession session) {
		return Optional.of(sessions.inverse().get(session));
	}
	
	public CDOSession getSession(IProject project) {
		CDORepository repo = repositories.inverse().get(project);
		CDOSession session = repo.acquireSession();
		sessions.put(repo, session);
		return session;
	}
	
	public void releaseSession(CDOSession session) {
		CDORepository repo = sessions.inverse().get(session);
		repo.releaseSession();
	}
}
