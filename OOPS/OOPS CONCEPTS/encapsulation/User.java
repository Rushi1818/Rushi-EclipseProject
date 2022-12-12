package encapsulation;

public class User {

	Account ref;
	public User() {
		
		ref=new Account();
		
	}
	
	public void credit(double amount) {
		
		ref.setBalance(amount);
	}
	
	public void getData(int accontno) {
		
		System.out.println(ref.getbalance(accontno));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User var=new User();
		System.out.println("before credit");
		var.getData(12345);
		var.credit(5000);
		System.out.println("after credit");
		var.getData(123);

	}

}
