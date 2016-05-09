package de.cooperateproject.ui.properties;

public class StoreAwareStringProperty extends StoreAwareProperty<String> {

	public StoreAwareStringProperty(String storageKey, String defaultValue) {
		super(storageKey, defaultValue, (s, k) -> s.getString(k), (s, k, v) -> s.setValue(k, v), (s, k, v) -> s.setDefault(k, v));
	}

}
