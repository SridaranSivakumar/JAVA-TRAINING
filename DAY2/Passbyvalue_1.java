package TaskDay2;
class ClassA{
	int a=10;
	public void MethodA(int a){
		a=a+100;

	}
	public void MethodB(ClassA obj) {
	obj.a=obj.a+100;
	}
	public int largest(int[] arr){
		int max=0;
		for(int i=0;i<arr.length;i++) {
			
				if(arr[0]<arr[i]) {
					max=arr[i];
				}
			}
		return max;
	}
}
public class Passbyvalue_1 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			ClassA obj=new ClassA();
			obj.MethodA(12);
			System.out.println(obj.a);
			obj.MethodB(obj);
			System.out.println(obj.a);
			int arr[]= {33,44,55,66};
			System.out.println(obj.largest(arr));
		
			
		}
		   
	}


