package Day1Task;

public class sortingArray {

	public static void main(String[] args) {
		int a[]= {50,5,20,33,44,25,7,15};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i:a) {
			System.out.println(i);
		}

	}

}
