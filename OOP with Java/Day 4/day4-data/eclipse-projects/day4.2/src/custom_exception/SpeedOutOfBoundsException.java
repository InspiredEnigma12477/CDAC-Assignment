package custom_exception;
//example of custom exc : checked exc
@SuppressWarnings("serial")
public class SpeedOutOfBoundsException extends Exception {
	public SpeedOutOfBoundsException(String mesg) {
		super(mesg);// to invoke immediate super cls(Exception) 's MATCHING ctor : to init err mesg
	}

}
