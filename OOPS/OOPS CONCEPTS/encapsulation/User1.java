package encapsulation;

public class User1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Layer var=new Layer();
	
	System.out.println("Previous Balance");
	var.getdata(1015);
	
    var.credit(10000);
    
    System.out.println("Updated Balance");
   
   var.getdata(1015);
	}

}
