package TaskDay2;
class StaticMethod{
	public StaticMethod() {
      System.out.println("Constructor block");
	}
	static{
		System.out.println("The first static block");
	}
	{
		System.out.println("The static method");
	}
	{
		System.out.println("The static method");
	}
	static {
		System.out.println("The second static block");
	}
	void methodA(int n) {
		System.out.println("method: "+n);
	}
}

public class OrderOfStatic_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StaticMethod obj=new StaticMethod();
        obj.methodA(10);
	}

}
