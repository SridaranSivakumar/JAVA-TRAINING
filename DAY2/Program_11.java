package TaskDay2;
class AA{
	public AA(int a){
		System.out.println("Class A");
	}
}
class BB{
	public BB(int b){
		System.out.println("Class B");
	}
}
class CC extends A{
	BB b=new BB(50);
	int a;
	public CC(int a){
		this.a=a;

	}
	
}

  
public class Program_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CC c=new CC(5);
	}

}
