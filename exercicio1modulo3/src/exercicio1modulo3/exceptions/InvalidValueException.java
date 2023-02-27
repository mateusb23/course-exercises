package exercicio1modulo3.exceptions;

public class InvalidValueException extends Exception {

	public InvalidValueException() {
	        super("INVALID VALUE");
	    }

	    public InvalidValueException(String message) {
	        super(message);
	    }
	
}
