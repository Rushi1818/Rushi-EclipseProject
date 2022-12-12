package encapsulation;

public class Account1 {

	//data hiding
	private double accBal=10000;
	
	public double getBal(int accNo) {
		//for getting accbalance
		return accBal;
	}
	
	public void setBal(int credit) {
		//to set account balance with credit 
		accBal+=credit;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
