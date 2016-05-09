package de.cooperateproject.ui.util;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TypedPropertyChangeValue<T> {

	private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
	private T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T newValue) {
		T oldValue = this.value;
		this.value = newValue;
		firePropertyChange("value", oldValue, newValue);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}

	protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
		changeSupport.firePropertyChange(propertyName, oldValue, newValue);
	}

}
