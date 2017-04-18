package de.cooperateproject.modeling.textual.cls.ui.outline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class OutlineFlattenFilterAndSorter extends OutlineFilterAndSorter {
    private IComparator comparator;

    @Override
    public IOutlineNode[] filterAndSort(Iterable<IOutlineNode> nodes) {
        final Iterable<IFilter> enabledFilters = getEnabledFilters();
        Iterable<IOutlineNode> filteredNodes = null;
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
        if (comparator != null && isSortingEnabled())
            Arrays.sort(nodesAsArray, comparator);
        return nodesAsArray;
    }

    private List<IOutlineNode> extractChildrenFromStructuralFeatureNodes(Iterable<IOutlineNode> nodes) {
        List<IOutlineNode> nodesToFilter = new ArrayList<>();
        for (IOutlineNode node : nodes) {
            if (node instanceof EStructuralFeatureNode) {
                EStructuralFeatureNode parent = (EStructuralFeatureNode) node;
                nodesToFilter.addAll(parent.getChildren());
            }
        }
        return nodesToFilter;
    }

    private Iterable<IOutlineNode> filterNodes(final Iterable<IFilter> enabledFilters,
            Iterable<IOutlineNode> nodesToFilter) {
        Iterable<IOutlineNode> filteredNodes;
        filteredNodes = Iterables.filter(nodesToFilter, new Predicate<IOutlineNode>() {
            @Override
            public boolean apply(final IOutlineNode node) {
                return Iterables.all(enabledFilters, new Predicate<IFilter>() {
                    @Override
                    public boolean apply(IFilter filter) {
                        return filter.apply(node);
                    }
                });
            }
        });
        return filteredNodes;
    }

}
