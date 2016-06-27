package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import org.eclipse.xtext.naming.QualifiedName;

public class QualifiedNameOrString {
	private final QualifiedName qualifiedName;
	private final String name;
	
	public QualifiedNameOrString(QualifiedName name) {
		this.qualifiedName = name;
		this.name = null;
	}
	
	public QualifiedNameOrString(String name) {
		this.qualifiedName = null;
		this.name = name;
	}

	public QualifiedName getQualifiedName() {
		return qualifiedName;
	}

	public String getName() {
		return name;
	}
	
	public boolean isQualified() {
		return qualifiedName != null;
	}
	
	@Override
	public String toString() {
		if (qualifiedName != null) {
			return qualifiedName.toString();
		}
		return name;
	}
}