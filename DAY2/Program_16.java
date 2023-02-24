package TaskDay2;
class X{
	void do1() {
		
	}
}
class Y extends X{
	 void do2() {
		System.out.println("Class y");
	}
}
public class Program_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       X x1= new X();
       X x2=new Y();
       Y x3=(Y) x1;
      x3.do2();
	}

}
