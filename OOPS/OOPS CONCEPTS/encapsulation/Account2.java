package encapsulation;

public class Account2 {
	
	private  int accBal=10000;
	
	public double getBal(int accNo) {
		return accBal;
		
	}
	
	public void setBal(int credit) {
		
		this.accBal+=credit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
