package de.cooperateproject.modeling.textual.cls.formatting2;

import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionExtensions;
import org.eclipse.xtext.xbase.lib.Extension;

public abstract class AbstractClsFormatter extends AbstractFormatter2{
	protected ITextRegionExtensions region;

	/*new (ITextRegionAccess regionAccess) {
		this.region = regionAccess.extensions
	}*/
	protected void format(ITextRegionExtensions region, Object obj, @Extension final IFormattableDocument document) {
		this.region = region;
		format(obj, document);
	}

	//public abstract void format(ITextRegionExtensions region, Object obj, @Extension final IFormattableDocument document);

	public abstract String getId();
	
	public abstract String getLabel();
}
