package custom_exceptions;

@SuppressWarnings("serial")
public class ShowroomHandlingException extends Exception {
	public ShowroomHandlingException(String mesg) {
		super(mesg);
	}
}
