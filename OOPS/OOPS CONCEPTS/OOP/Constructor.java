package OOP;

public class Constructor {

	public Constructor(int x) {
		
		System.out.println(" Hello World " + x);
		
		
	}
	
	public Constructor (int x , String z) {
		
		this(30);
		
		System.out.println( " Constructor in Constructor" + x + z);
		
	}
	public static void main(String[] args) {
   
		Constructor var=new Constructor( 10 , "abhi" );
		
		
	}

}
