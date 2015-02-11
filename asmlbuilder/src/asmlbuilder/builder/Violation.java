package asmlbuilder.builder;

import org.eclipse.core.resources.IResource;

public class Violation {
	IResource resource = null;
	String message;
	int lineNumber;
	int severity;

	public Violation(IResource resource, String message, int lineNumber, int severity) {
		this.resource=resource;
		this.message=message;
		this.lineNumber=lineNumber;
		this.severity=severity;
	}

	public IResource getResource() {
		return resource;
	}

	public String getMessage() {
		return message;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public int getSeverity() {
		return severity;
	}
}
