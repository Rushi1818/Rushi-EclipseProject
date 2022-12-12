package Interface;

public class IM2 implements Interface3 ,Interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IM2 var=new IM2();
		
		var.m1();
		var.m2();

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("methhod 1");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("method 2");
	}

}
