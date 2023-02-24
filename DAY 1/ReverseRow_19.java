package Day1Task;

public class ReverseRow_19 {
public static void main(String[] args) {
	int a[][]= {{33,44,55,66},{11,12,13,14}};
	int b=3;
	System.out.println(b);
	for(int i=0;i<2;i++) {
		for(int j=0;j<4/2;j++) {
		int temp=a[i][j];
		a[i][j]=a[i][b-j];
		a[i][b-j]=temp;
	}
	}
	for(int i=0;i<2;i++) {
		for(int j=0;j<4;j++) {

		System.out.print(a[i][j]+"  ");
	}
		System.out.println();
}
}
}