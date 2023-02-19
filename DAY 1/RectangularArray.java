package Day1Task;

public class RectangularArray {

	public static void main(String[] args) {
		int count=1;
		int[][] array=new int[4][4];
        for(int i=0;i<4;i++) {
        	for(int j=0;j<=i;j++) {
        		array[i][j]=count++;
        		System.out.print(array[i][j]+"  ");
        	}
        	System.out.println();
        }
       
	}

}
