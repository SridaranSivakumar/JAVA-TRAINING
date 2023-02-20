package Day1Task;



public class derived_25{
	public static void main(String[] args) {
		derived d=new derived();
		d.useD();
	}
		
	
}
class base{
	String method() {
		return "wow";
	}
}

 class derived extends base{
	public  void useD() {
		base z=new base();
		
System.out.println("base says: "+z.method());
	}
}