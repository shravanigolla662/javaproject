package anudip;

//Custom exception class for handling insufficient balance scenario
public class InsufficientBalanceExecption extends Exception{
	String msg;
	public InsufficientBalanceExecption(String msg) {
		super();
		this.msg = msg;
	}

}
