package de.cooperateproject.modeling.cdo.commithistory.protocol;

@Deprecated
public class CommitManager {
//
//    /**
//     * Timeout in milliseconds for the waiting time while loading the CDOCommitHistory.
//     */
//    private static final long LOADING_TIMEOUT = 8000;
//    private static final Logger LOGGER = LoggerFactory.getLogger(CommitManager.class);
//
//    public List<CDOCommitInfo> getCommitsFromMainBranch(CDOSession session, long from, long to,
//            Iterable<CDOID> resourceIds, Iterable<CDOID> relevantCrossReferencedResourceIds) {
//
//        Optional<IConnector> connector = Optional.of(session).filter(CDONet4jSessionImpl.class::isInstance)
//                .map(CDONet4jSessionImpl.class::cast).map(CDONet4jSessionImpl::getConnector);
//        List<Long> relevantTimeStamps = Collections.emptyList();
//        if (connector.isPresent()) {
//
//            CDOCommitHistoryProtocol protocol = new CDOCommitHistoryProtocol();
//            IChannel channel = protocol.open(connector.get());
//            try {
//                CDOCommitHistoryProtocolGetChangedTimestamps request = new CDOCommitHistoryProtocolGetChangedTimestamps(
//                        protocol, session.getRepositoryInfo().getName());
//                request.addRequestedResource(resourceIds);
//                request.addCrossReferencedResourceToConsider(relevantCrossReferencedResourceIds);
//                request.setRelevantTimeRange(Range.between(from, to));
//                relevantTimeStamps = request.send();
//
//                List<CDOCommitInfo> result = new ArrayList<>();
//
//                if (relevantTimeStamps.isEmpty()) {
//                    return result;
//                }
//
//                Long first = relevantTimeStamps.get(0);
//                Long last = relevantTimeStamps.get(relevantTimeStamps.size() - 1);
//                session.getCommitInfoManager().getCommitInfos(session.getBranchManager().getMainBranch(), first, last,
//                        result::add);
//                result.removeIf(info -> info.getTimeStamp() < first || info.getTimeStamp() > last);
//                return result;
//            } catch (Exception e) {
//                LOGGER.error("Could not access cache.", e);
//            } finally {
//                IOUtil.closeSilent(channel);
//            }
//
//        }
//
//        return Collections.emptyList();
//
//        // CDOCommitInfoManager commitManager = session.getCommitInfoManager();
//        // commitManager.getCommitInfos(session.getBranchManager().getMainBranch(), timeStampFrom, timeStampTo,
//        // commitInfoHandler);
//        //
//        //
//        // CDOBranch mainBranch = session.getBranchManager().getMainBranch();
//        // CDOCommitHistory mainHistory = commitManager .getHistory(mainBranch);
//        //
//        // mainHistory.triggerLoad(handler)
//        //
//        // mainHistory.waitWhileLoading(LOADING_TIMEOUT);
//        //
//        // return getCommitsByTime(session, mainBranch, mainHistory, timeStamp, resourceIds.iterator().next());
//    }
//
//    private static List<CDOCommitInfo> getCommitsByTime(CDOSession session, CDOBranch mainBranch,
//            CDOCommitHistory mainHistory, long timeStamp, CDOID resourceCDOId) {
//        List<CDOCommitInfo> commitInfos = new ArrayList<>();
//
//        for (int i = 0; i < mainHistory.size() - 1; i++) {
//            CDOCommitInfo commitInfo = mainHistory.getElement(i);
//
//            if (isTimeStampInvalid(commitInfo, timeStamp)) {
//                break;
//            }
//
//            CDOCommitInfo previousCommitInfo = mainHistory.getElement(i + 1);
//            CDOView previousState = null;
//            CDOView currentState = null;
//            try {
//                previousState = session.openView(mainBranch, previousCommitInfo.getTimeStamp());
//                currentState = session.openView(mainBranch, commitInfo.getTimeStamp());
//
//                if (doChangedObjectsExists(resourceCDOId, previousState, currentState, commitInfo)) {
//                    commitInfos.add(commitInfo);
//                }
//            } finally {
//                IOUtil.closeSilent(previousState);
//                IOUtil.closeSilent(currentState);
//            }
//        }
//        return commitInfos;
//    }
//
//    private static boolean isTimeStampInvalid(CDOCommitInfo commitInfo, long firstCommitTimeStamp) {
//        boolean isFirstCommitTimeStampGreater = commitInfo.getTimeStamp() < firstCommitTimeStamp;
//        boolean isPreviousTimeStampInvalid = commitInfo.getPreviousTimeStamp() == CDOCommitInfo.INVALID_DATE;
//
//        return isFirstCommitTimeStampGreater || isPreviousTimeStampInvalid;
//    }
//
//    private static boolean doChangedObjectsExists(CDOID resourceCDOId, CDOView previousState, CDOView currentState,
//            CDOCommitInfo commitInfo) {
//        Set<CDOID> changeCDOIds = getChangedObjectsId(commitInfo);
//
//        addXRefOfChangedObjects(previousState, changeCDOIds);
//
//        return !changedTextualObjects(resourceCDOId, previousState, currentState, changeCDOIds).isEmpty();
//    }
//
//    private static void addXRefOfChangedObjects(CDOView previousState, Set<CDOID> changeCDOIds) {
//        List<CDOObjectReference> queryXRefs = getCDOObjectReferenceFromChangedObjects(previousState, changeCDOIds);
//
//        Set<CDOID> queryXRefsIds = queryXRefs.stream().map(CDOObjectReference::getSourceID).collect(Collectors.toSet());
//        changeCDOIds.addAll(queryXRefsIds);
//    }
//
//    private static Set<CDOID> changedTextualObjects(CDOID resourceCDOId, CDOView previousState, CDOView currentState,
//            Set<CDOID> changeCDOIds) {
//        return changeCDOIds.stream().filter(object -> parentMatches(object, resourceCDOId, previousState, currentState))
//                .collect(Collectors.toSet());
//    }
//
//    private static List<CDOObjectReference> getCDOObjectReferenceFromChangedObjects(CDOView previousState,
//            Set<CDOID> changeCDOIds) {
//        List<CDOObjectReference> queryXRefs = new ArrayList<>();
//        for (CDOID id : changeCDOIds) {
//            if (id == null) {
//                continue;
//            }
//            try {
//                queryXRefs.addAll(previousState.queryXRefs(previousState.getObject(id)));
//            } catch (ObjectNotFoundException e) {
//                LOGGER.trace(e.getMessage(), e);
//            }
//        }
//        return queryXRefs;
//    }
//
//    private static Set<CDOID> getChangedObjectsId(CDOCommitInfo commitInfo) {
//        List<CDOIDAndVersion> changedObjects = Lists.newArrayList(Iterables.concat(commitInfo.getNewObjects(),
//                commitInfo.getDetachedObjects(), commitInfo.getChangedObjects()));
//
//        return changedObjects.stream().map(CDOIDAndVersion::getID).collect(Collectors.toSet());
//    }
//
//    /**
//     * Checks if the Object with objectId really belongs to the textual model.
//     * 
//     * @param objectId
//     *            the CDOID of the object to be examined
//     * @param parentId
//     *            the CDOID of the textual model/resource
//     * @param previousView
//     *            the previous view of the commit
//     * @param currentView
//     *            the current view of the commit
//     * @return true if it belongs to the textual model, false if not
//     */
//    private static boolean parentMatches(CDOID objectID, CDOID parentID, CDOView previousView, CDOView currentView) {
//        boolean ret = checkParentMatching(objectID, parentID, previousView);
//        if (!ret) {
//            return checkParentMatching(objectID, parentID, currentView);
//        }
//        return ret;
//    }
//
//    /**
//     * Checks if the Object with objectId really belongs to the textual model.
//     * 
//     * @param objectId
//     *            the CDOID of the object to be examined
//     * @param parentId
//     *            the CDOID of the textual model/resource
//     * @param view
//     *            the view in which the object is examined
//     * @return true if it belongs to the textual model, false if not
//     */
//    private static boolean checkParentMatching(CDOID objectID, CDOID parentID, CDOView view) {
//        try {
//            CDOObject object = view.getObject(objectID);
//            return object.cdoResource().cdoID().equals(parentID);
//        } catch (ObjectNotFoundException e) {
//            LOGGER.trace(e.getMessage(), e);
//        }
//        return false;
//    }

}
