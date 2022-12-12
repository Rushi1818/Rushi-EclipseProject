package encapsulation;

public class Layer {

	Account1 ref;
	public Layer() {
		
		ref=new Account1();
		
	}
	
	public void credit(int amount) {
		
		ref.setBal(amount);
	}
	
	public void getdata(int pinNo) {
		System.out.println(ref.getBal(pinNo));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
