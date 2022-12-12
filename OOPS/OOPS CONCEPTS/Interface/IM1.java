package Interface;

public class IM1 implements Interface1,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IM1 var=new IM1();
		var.m1();
		var.m2();
		var.m3();
		var.m4();
	    var.m5();
     	var.m6();
	}
	

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(x);
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Habibi");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Come To Dubai");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("Blank");
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("Totally Blank");
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		System.out.println("The End");
	}

}
