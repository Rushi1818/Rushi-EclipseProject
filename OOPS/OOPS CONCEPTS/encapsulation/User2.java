package encapsulation;

public class User2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Layer2 L=new Layer2();
		System.out.println("Balance Before Credit");
		
		L.getData(1010);
		L.credit(10000);
		
		System.out.println("Updated Balance");
	
		L.getData(10);
	}

}
