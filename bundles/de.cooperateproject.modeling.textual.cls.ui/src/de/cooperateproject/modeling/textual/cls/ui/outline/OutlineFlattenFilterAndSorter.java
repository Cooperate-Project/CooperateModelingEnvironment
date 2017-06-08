package de.cooperateproject.modeling.textual.cls.ui.outline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter;

import com.google.common.collect.Iterables;

/**
 * Filter and sorter for the cooperate cls outline that flattens the structure.
 * 
 * @author czogalik
 *
 */
public class OutlineFlattenFilterAndSorter extends OutlineFilterAndSorter {
    private IComparator comparator;

    @Override
    public IOutlineNode[] filterAndSort(Iterable<IOutlineNode> nodes) {
        final Iterable<IFilter> enabledFilters = getEnabledFilters();
        Iterable<IOutlineNode> filteredNodes;
        if (Iterables.isEmpty(enabledFilters)) {
            filteredNodes = nodes;
        } else {

            List<IOutlineNode> childrenFromFeatureNodes = extractChildrenFromStructuralFeatureNodes(nodes);
            if (!childrenFromFeatureNodes.isEmpty()) {
                filteredNodes = filterNodes(enabledFilters, childrenFromFeatureNodes);
            } else {
                filteredNodes = filterNodes(enabledFilters, nodes);
            }
        }
        IOutlineNode[] nodesAsArray = Iterables.toArray(filteredNodes, IOutlineNode.class);
        if (comparator != null && isSortingEnabled()) {
            Arrays.sort(nodesAsArray, comparator);
        }
        return nodesAsArray;
    }

    private static List<IOutlineNode> extractChildrenFromStructuralFeatureNodes(Iterable<IOutlineNode> nodes) {
        List<IOutlineNode> nodesToFilter = new ArrayList<>();
        for (IOutlineNode node : nodes) {
            if (node instanceof EStructuralFeatureNode) {
                EStructuralFeatureNode parent = (EStructuralFeatureNode) node;
                nodesToFilter.addAll(parent.getChildren());
            }
        }
        return nodesToFilter;
    }

    private static Iterable<IOutlineNode> filterNodes(final Iterable<IFilter> enabledFilters,
            Iterable<IOutlineNode> nodesToFilter) {
        Iterable<IOutlineNode> filteredNodes;
        filteredNodes = Iterables.filter(nodesToFilter,
                node -> Iterables.all(enabledFilters, filter -> filter.apply(node)));
        return filteredNodes;
    }
}
