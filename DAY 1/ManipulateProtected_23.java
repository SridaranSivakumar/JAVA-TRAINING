package Day1Task;


class ClassC{
	protected int val1=20;
	protected void display() {
		System.out.println(val1);
	}
}
class ClassB extends ClassC{
	protected void display1() {
		System.out.println(val1);
	}
}

public class ManipulateProtected_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ClassB obj=new ClassB();
       obj.display();
       obj.display1();
	}

}
