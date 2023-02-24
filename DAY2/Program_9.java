package TaskDay2;
class ClassAA{
	public int variable1=10;
	protected int variable2=20;
	private int variable3=30;
	public void methodA(){
		System.out.println("public method");
	}
	protected void methodB() {
		System.out.println("Protected method");
	}
	private void methodC() {
		System.out.println("private method");
	}
	
}
class ClassB extends ClassAA{
	void display() {
		System.out.println(variable1);
		System.out.println(variable2);
		//System.out.println(variable3);
	}
	
}
public class Program_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ClassB obj=new ClassB();
         obj.display();
         obj.methodA();
         obj.methodB();
         //obj.methodC();
         
	}

}
