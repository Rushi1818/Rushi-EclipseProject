package Mock;

public class Spacecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My Life is my passion";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);	
		
		if(ch==' ') {
				
				count++;
				
				
			}
		}

		System.out.println("No of space" + count);
	}

}
