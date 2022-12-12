package encapsulation;

public class Account {

	private double accountBalance=10000;
	
	public double getbalance(int accNo) {

		return accountBalance;
		
		
	}
	
	public void setBalance(double amount) {
		
		accountBalance+=amount;
	}
				
				
	static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
