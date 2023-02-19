package Day1Task;

import java.util.Scanner;

public class LocationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {33,44,55,66,77,88};
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<a.length;i++) {
        	if(a[i]==N) {
        		System.out.println(i+1);
        		break;
        	}
        }
	}

}
