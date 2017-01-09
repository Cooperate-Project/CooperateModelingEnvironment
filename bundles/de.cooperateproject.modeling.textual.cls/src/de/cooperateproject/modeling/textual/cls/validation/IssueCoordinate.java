package de.cooperateproject.modeling.textual.cls.validation;

import org.eclipse.xtext.validation.Issue;

class IssueCoordinate {
	public static final IssueCoordinate UNKNOWN_ISSUE_COORDINATE = new IssueCoordinate(-1, -1);
	private final int lineNumber;
	private final int columnNumber;

	public IssueCoordinate(Issue issue) {
		this(issue.getLineNumber() == null ? -1 : issue.getLineNumber(),
				issue.getColumn() == null ? -1 : issue.getColumn());
	}

	public IssueCoordinate(int lineNumber, int columnNumber) {
		super();
		this.lineNumber = lineNumber;
		this.columnNumber = columnNumber;
	}
	
	public int getLineNumber() {
		return lineNumber;
	}

	public int getColumnNumber() {
		return columnNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columnNumber;
		result = prime * result + lineNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IssueCoordinate other = (IssueCoordinate) obj;
		if (columnNumber != other.columnNumber)
			return false;
		if (lineNumber != other.lineNumber)
			return false;
		return true;
	}

	public static IssueCoordinate create(Issue issue) {
		return new IssueCoordinate(issue);
	}
}