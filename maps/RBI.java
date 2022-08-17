package abstraction;


public abstract class RBI extends WorldBank {
	public void createAccount() {
		System.out.println("RBI: Account created");
	}
	public void processLoan() {
		System.out.println("RBI; rate of intrest is 9%");
	}
	public abstract void ppf() ;
		
		
	

}
