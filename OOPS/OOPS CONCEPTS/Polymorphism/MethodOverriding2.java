package Polymorphism;

public class MethodOverriding2 extends MethodOverriding {
	
	public void method1() {
		
		System.out.println("Love Marriage");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MethodOverriding2 n = new  MethodOverriding2();
		  n.method1();
		 
		  int arr[]= {2,3,4};
	/*	MethodOverriding m =new  MethodOverriding2();

		m.method1();*/
	}
	
	public static void main(int[] args) {
		
		System.out.println("Main method");
	}

}
