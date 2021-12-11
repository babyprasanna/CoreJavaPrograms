package exceptions;

public class InvalidName extends RuntimeException  {

	String ErrorMessage = "";

	public InvalidName() {

		ErrorMessage = "Invalied String Not Accetable";

	}

	public InvalidName(String ErrorMessage) {
		this.ErrorMessage = ErrorMessage;
	}

	@Override
	public String toString() {
		return "InvalidName [ErrorMessage=" + ErrorMessage + "]";
	}

}
