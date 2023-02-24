package TaskDay2;

class Student{
	String Name="Mahesh";
	int RollNo=22;
}
class Exam extends Student{
	int Chemistry=70;
	int Maths=90;
	int physics=80;
}
class result extends Exam{
	void total() {
		int totalmarks=Chemistry+physics+Maths;
		System.out.println(totalmarks);
	}
}

public class Program_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result res=new result();
		res.total();
    
	}

}
