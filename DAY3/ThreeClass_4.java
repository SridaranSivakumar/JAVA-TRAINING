package Day3task;
interface A{
	int val1=45;
	void methodA();
}
interface B{
	int val2=55;
	void methodb();

}
interface C{
	int val3=23;
	void methodc();

}
interface ABC extends A,B,C{
	int val4=78;
	void methodABC();
}
class SecondClass{
	
}
class ThirdClass extends SecondClass implements ABC{
	
	void methodE(ABC g){
		System.out.println(val1);
	}
  void methodH(A a) {
	  System.out.println(val2);
  }
 void methodL(B b) {
	 System.out.println(val3);
  }
 void methodK(C c) {
	 System.out.println(val4);
 }
  
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodABC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodc() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ThreeClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ThirdClass c=new ThirdClass();
      c.methodE(c);
      c.methodH(c);
      c.methodK(c);
      c.methodL(c);
      c.methodABC();
	}

}
