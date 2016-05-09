package de.cooperateproject.ui.properties;

public class StoreAwareIntegerProperty extends StoreAwareProperty<Integer> {

	public StoreAwareIntegerProperty(String storageKey, Integer defaultValue) {
		super(storageKey, defaultValue, (s, k) -> s.getInt(k), (s, k, v) -> s.setValue(k, v),
				(s, k, v) -> s.setDefault(k, v));
	}

}
