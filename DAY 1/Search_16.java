package Day1Task;

import java.util.Scanner;

public class Search_16 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] Arr=new int[6];
		for(int i=0;i<6;i++) {
			Arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search");
		
		int N=sc.nextInt();
		System.out.println("Location of element");
		int count=0;
		for(int i=0;i<6;i++) {
		if(N==Arr[i]) {
			count++;
			System.out.print((i+1)+"  ");
		}
		}
		if(count==0) {
			System.out.println("The element is not present");
		}
		System.out.println();
		System.out.println("No of times present:  "+count);
	}
    }
