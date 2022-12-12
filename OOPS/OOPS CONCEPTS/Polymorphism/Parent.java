package Polymorphism;

public class Parent {
	
	public void gold() {
		
		System.out.println("Parent Gold");
	}
	
	public void money() {
		
		System.out.println("parent money" );
	}
	public static void home() {
		
		System.out.println("Parent Home");
	}
	
	public static void home(int x) {
		System.out.println("good");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		home(10);
	}

}
