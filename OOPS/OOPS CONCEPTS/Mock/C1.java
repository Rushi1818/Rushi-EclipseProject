package Mock;

public class C1 extends C2 {

	public void m1() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C2 ref=new C1();
		
		ref.m1();
	}

}
