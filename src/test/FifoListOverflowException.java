package test;

public class FifoListOverflowException extends Exception {
	String message;

	public FifoListOverflowException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
	
	
}

 class FifoListUnderflowException extends Exception{
	String message;

	public FifoListUnderflowException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
	
	
	
 }