package bankaccount;

public class account {

	private double balance;

	public account(double balance) {
		
		if(balance >0 ) {
			this.balance = balance;
		}
	}
	
	
	public void credit(double amount) {
		balance=balance + amount;
	}


	public double getBalance() {
		return balance;
	}
	
}
