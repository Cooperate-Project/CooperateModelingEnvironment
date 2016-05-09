package de.cooperateproject.ui.properties;

import org.eclipse.jface.preference.IPreferenceStore;

public abstract class StoreAwareProperty<T> {
	
	@FunctionalInterface
	protected interface TypedDefaultSetter<T> {
		public void setDefault(IPreferenceStore store, String storageKey, T value);
	}
	
	@FunctionalInterface
	protected interface TypedValueGetter<T> {
		public T getValue(IPreferenceStore store, String storageKey);
	}
	
	@FunctionalInterface
	protected interface TypedValueSetter<T> {
		public void setValue(IPreferenceStore store, String storageKey, T value);
	}
	
	private final String storageKey;
	private final T defaultValue;
	private final TypedValueGetter<T> valueGetter;
	private final TypedValueSetter<T> valueSetter;
	private final TypedDefaultSetter<T> defaultSetter;
	
	protected StoreAwareProperty(String storageKey, T defaultValue, TypedValueGetter<T> valueGetter, TypedValueSetter<T> valueSetter, TypedDefaultSetter<T> defaultSetter) {
		this.storageKey = storageKey;
		this.defaultValue = defaultValue;
		this.valueGetter = valueGetter;
		this.valueSetter = valueSetter;
		this.defaultSetter = defaultSetter;
	}

	public void init(IPreferenceStore store) {
		this.defaultSetter.setDefault(store, storageKey, defaultValue);
	}
	
	public T getDefault() {
		return defaultValue;
	}

	public void setValue(IPreferenceStore store, T value) {
		this.valueSetter.setValue(store, storageKey, value);
	}

	public T getValue(IPreferenceStore store) {
		return this.valueGetter.getValue(store, storageKey);
	}
	
}