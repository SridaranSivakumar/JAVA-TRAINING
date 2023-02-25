package TaskDay4;
class Base{
	Base() throws Exception{
		System.out.println("base class");
//		int a[]=new int[2];
//		a[5]=10;
	}
}
class Derived extends Base{

	Derived() throws Exception {
		System.out.println("Derived class");
		try {
			  //super();
			}catch(ArrayIndexOutOfBoundsException ae) {
				ae.printStackTrace();
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
		
	}
	
}
public class DerivedCon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Derived calling=new Derived();
	}

}
//change