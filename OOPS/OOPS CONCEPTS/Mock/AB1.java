package Mock;

public class AB1 implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AB1 var=new AB1();
		
		var.m1();
		var.m2();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Mock Test");
	}

}
