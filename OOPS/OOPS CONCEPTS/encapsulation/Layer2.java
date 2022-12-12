package encapsulation;

public class Layer2 {

	Account2 ref;
	public Layer2() {
		ref=new Account2();
	}
	public void credit(int amount) {
		
		ref.setBal(amount);
	}
	
	public void getData(int pin) {
		
		System.out.println(ref.getBal(pin));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Layer2 O = new Layer2();
		
	//	O.getData(1010);
	 //O.credit(5000);
	//O.getData(0);
	}

}
