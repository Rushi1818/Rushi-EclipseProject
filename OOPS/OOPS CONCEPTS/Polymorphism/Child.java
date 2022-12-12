package Polymorphism;

public class Child extends Parent{
	
	public void gold() {
		
		System.out.println("Child gold");
	}
	
	public void money() {
		
		System.out.println("child money");
	}
	public static void home() {
		
		System.out.println("Child home");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p=new Child();
		
		p.gold();
		p.money();
		p.home();
	}

}
