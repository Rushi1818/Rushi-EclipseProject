package Mock;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153;
	int y=no;
		int length=0;
		int rem;
		while(y!=0) {
			length=length+1;
			
			y=y/10;
		}
		int y2=no;

		int aNO=0;
		while(y2!=0) {
			int m=1;
			rem=y2%10;
			for(int i=1 ;i<=length ; i++) {
				
				m=m*rem;
			}
			aNO=aNO+m;
			y2=y2/10;
		}
		if(aNO==no) {
			System.out.println(no+"Is a armstrong no");
		}
		else {
			System.out.println(no+"Is not armstrong no");
		}

	}

}
