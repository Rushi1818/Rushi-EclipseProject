package OOP;

public class C1 {


	int rollnumber;
	String s;
	
	public C1(int i , String s) {
		
		this.rollnumber= i;
		this.s =s;
		
		
	}
	
	public static void main(String[] args) {
		
		
		C1 ref=new C1(10, "abhi");
		
		System.out.println(ref.rollnumber + ref.s);
		
	}


	
}

