package Day1Task;

class Modifiers{
	private int val1=10;
	protected int val2=20;
	int val3=30;
	private void MethodA() {
		System.out.println(val1);
	}
	protected void MethodB() {
		System.out.println(val2);
	}
	void MethodC() {
		System.out.println(val3);
		
	}
	public void MethodD() {
		System.out.println(val3);
	}
}




public class AccesModifier_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Modifiers obj=new Modifiers();
      obj.MethodD();
      //System.out.println(obj.val1);
	}

}
