package Day1Task;

import java.util.Scanner;

public class TwodimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int N=4;
     int count=1;
     int[][] a=new int[N][N];
     for(int i=0;i<N;i++) {
    	 for(int j=0;j<N;j++) {
    		  a[i][j]=count++;
    		  System.out.print(a[i][j]+"  ");
    	     //System.out.println();
    	 }
    	 System.out.println();
     }
	}

}
