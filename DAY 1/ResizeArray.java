	package Day1Task;

import java.util.*;

public class ResizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]={1,2,3};
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   a=Arrays.copyOf(a, x);
   for(int i:a) {
   System.out.println(i);
	}

}
}