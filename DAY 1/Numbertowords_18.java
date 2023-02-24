package Day1Task;

import java.util.Scanner;

public class Numbertowords_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
		String arr[]=new String[3];
		int n=523;
		int count=0;
		while(n!=0) {
			int a=n%10;
			arr[count]=single_digits[a];
			count++;
			n=n/10;
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
