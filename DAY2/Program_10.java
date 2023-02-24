package TaskDay2;

class A{
	A(){
		System.out.println("Class A");
	}
}
class B{
	B(){
		System.out.println("Class B");
	}
}
class C extends A{
	B b=new B();
}
public class Program_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C c=new C();
	}

}
