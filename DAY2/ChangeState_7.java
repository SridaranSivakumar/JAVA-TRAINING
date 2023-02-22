package TaskDay2;
class ReferenceVariable{
	String name;
	long phoneno;
	public ReferenceVariable(String name,long phoneno) {
	this.name=name;
	this.phoneno=phoneno;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("PhoneNo: "+phoneno);
	}
}
public class ChangeState_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Before change");
      final ReferenceVariable obj=new ReferenceVariable("Magesh", 9876543210l);
      obj.display();
      System.out.println("After change");
      obj.name="Pranav";
      obj.phoneno=9876356789l;
      obj.display();
	}

}
