package Day1Task;

public class LargeNoArray_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{33,44,55,66},{11,12,13,14}};
		
		for(int i=0;i<2;i++) {
			int largest=0;
			for(int j=0;j<4;j++) {
				if(largest<a[i][j]) {
					largest=a[i][j];
				}
			}
			System.out.println("The largest no is: "+largest);
			}
	}

}
