package de.cooperateproject.modeling.textual.cls.formatting2;

public interface IFormatterSelector {

	AbstractClsFormatter getSelectedFormatter();

	void setSelectedFormatter(AbstractClsFormatter formatter);

	boolean setSelectedFormatter(String formatterId);

}