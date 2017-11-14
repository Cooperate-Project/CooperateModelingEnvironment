package de.cooperateproject.ui.diff.labeling;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cooperateproject.ui.diff.LabelHandlerRegistry;
import de.cooperateproject.ui.diff.content.SummaryItem;

/**
 * Label provider for a table viewer which lists all changes in a commit.
 * Delegates the labeling to the meta-model-specific label handler.
 * 
 * @author Jasmin, czogalik
 *
 */
public class SummaryLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (!(element instanceof SummaryItem)) {
			return null;
		}

		SummaryItem item = (SummaryItem) element;

		Collection<LabelHandler> labelHandlers = findLabelHandlers(item);
		if (labelHandlers.isEmpty()) {
			return null;
		}

		return getColumnText(columnIndex, item, labelHandlers);
	}

	private static String getKindText(Collection<LabelHandler> labelHandlers, SummaryItem diffItem) {
		EStructuralFeature changedFeature = diffItem.getChangedFeature();
		if (changedFeature instanceof EAttribute) {
			return String.format("set %s", getClassLabel(labelHandlers, (EAttribute)changedFeature));
		} else if (changedFeature instanceof EReference) {
			boolean isContainment = ((EReference) changedFeature).isContainment();
			DifferenceKind changeKind = diffItem.getDifferenceKind();

			if (isContainment && changeKind == DifferenceKind.ADD) {
				EObject newValue = (EObject) diffItem.getNewValue();
				return String.format("add %s", getTextLabel(labelHandlers, newValue));
			} else if (isContainment && changeKind == DifferenceKind.DELETE) {
				EObject oldValue = (EObject) diffItem.getOldValue();
				return String.format("del %s", getTextLabel(labelHandlers, oldValue));
			} else if (!isContainment && changeKind != DifferenceKind.MOVE) {
				return String.format("set %s", changedFeature.getName());
			} else if (changeKind == DifferenceKind.MOVE) {
				EObject newValue = (EObject) diffItem.getNewValue();
				return String.format("mov %s", getTextLabel(labelHandlers, newValue));
			} else {
				// error
			}

		}

		return null;
	}

	private static String getColumnText(int columnIndex, SummaryItem item, Collection<LabelHandler> labelHandlers) {
		switch (columnIndex) {
		case 0:
			return getKindText(labelHandlers, item);
		case 1:
			return getTextLabel(labelHandlers, item.getChangedObject());
		case 2:
			return getOldLabel(labelHandlers, item);
		case 3:
			return getNewLabel(labelHandlers, item);
		default:
			return null;
		}
	}

	private static String getNewLabel(Collection<LabelHandler> labelHandlers, SummaryItem item) {
		return getValueLabel(labelHandlers, item, item::getNewValue);
	}

	private static String getOldLabel(Collection<LabelHandler> labelHandlers, SummaryItem item) {
		return getValueLabel(labelHandlers, item, item::getOldValue);
	}

	private static String getValueLabel(Collection<LabelHandler> labelHandlers, SummaryItem item,
			Supplier<Object> valueGetter) {
		if (item.getDifferenceKind() == DifferenceKind.MOVE) {
			return null;
		}
		boolean isContainment = Optional.ofNullable(item.getChangedFeature()).filter(EReference.class::isInstance)
				.map(EReference.class::cast).map(EReference::isContainment).orElse(false);
		if (isContainment && (item.getDifferenceKind() == DifferenceKind.ADD
				|| item.getDifferenceKind() == DifferenceKind.DELETE)) {
			return null;
		}
		return getTextLabel(labelHandlers, valueGetter.get());
	}

	private static String getTextLabel(Collection<LabelHandler> labelHandlers, Object object) {
		return execute(object, o -> labelHandlers.stream().map(lh -> lh.getText(o)).filter(Objects::nonNull).findFirst()
				.orElseGet(() -> object == null ? null : object.toString()));
	}
	
	private static String getClassLabel(Collection<LabelHandler> labelHandlers, EAttribute object) {
		return execute(object, o -> labelHandlers.stream().map(lh -> lh.getClassText(o)).filter(Objects::nonNull)
				.findFirst().orElseGet(() -> object == null ? null : object.getName()));
	}

	private static <R> R execute(Object object, Function<Object, R> objectFn) {
		return Optional.ofNullable(object).map(objectFn::apply).orElse(null);
	}

	private static Collection<LabelHandler> findLabelHandlers(SummaryItem item) {
		String packageName = item.getChangedObject().getClass().getPackage().getName();
		return LabelHandlerRegistry.getInstance().getLabelHandlers(packageName);
	}

}
