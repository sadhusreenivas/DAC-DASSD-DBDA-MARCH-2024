package exceptions;

public class InsufficientFundsException extends Exception{
	
	public InsufficientFundsException(String errMsg) {
		super(errMsg);
	}

}
