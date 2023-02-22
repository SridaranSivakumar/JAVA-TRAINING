package TaskDay2;
class house{
	door d1=new door(10,20);
	window w=new window(30,40);
	void display() {
	d1.cost();
	w.cost();
}


}


class door{
	int a,b;
	door(int a,int b){
		this.a=a;
		this.b=b;
	}
	public  void cost() {
		int calculate=a*b;
		System.out.println(calculate);
	}
}
class window{
	int a,b;
	window(int a,int b){
		this.a=a;
		this.b=b;
	}
	void cost() {
		int calculate=a*b;
		System.out.println(calculate);

	}

}
public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      house h=new house();
      h.display();
	}

}
