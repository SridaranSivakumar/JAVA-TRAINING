package Day1Task;

public class ReversingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {33,44,55,66,77,88};
		int b=a.length-1;
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[b-i];
			a[b-i]=temp;
		}
		for(int i:a) {
			System.out.println(i);
		}
	}

}
