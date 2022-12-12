package Abstract;

public class Sub extends AB1 {
	
	public Sub() {
		super(10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB1 var= new Sub();
		var.m1();
		var.m2();
		var.m3();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract MEthod2");
	}

}
