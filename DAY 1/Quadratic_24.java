package Day1Task;


class classA{
	int a;
	int b;
	int c;
	public classA() {
		a=b=c=1;
		}
	public classA(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int getA() {
		return a;
	}
	int getB() {
		return b;
	}
	int getc() {
		return c;
	}
	public int methodA(int x) {
		int Ans=(a*x*x+b*x+c);
		return Ans;
	}
}
public class Quadratic_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classA A=new classA();
        classA B=new classA(2,3,4);
        System.out.println(A.methodA(3));
	}

	
	

}
