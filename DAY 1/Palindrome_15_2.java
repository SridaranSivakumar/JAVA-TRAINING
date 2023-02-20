package Day1Task;

import java.util.Scanner;

public class Palindrome_15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int PalinNum=Palindrome(N);
      int AmsNum=Amstrong(N);
      int perNum=PerfectNum(N);
      if(PalinNum==0 && AmsNum==0 && perNum==0){
    	  System.out.print("None of these");
      }
	}

	private static int PerfectNum(int n) {
		// TODO Auto-generated method stub
		int Ans=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				Ans+=i;
			}
		}
		if(n==Ans) System.out.println("This no is perfect num");
		else Ans=0;
		return Ans;
		
	}

	private static int Amstrong(int n) {
		// TODO Auto-generated method stub
		int Ans=0;
		int b=n;
		while(n>0) {
			int a=n%10;
			Ans+=Math.pow(a, 3);
			n=n/10;
		}
		if(b==Ans) 
			System.out.println("This no is Amstrong");
		else Ans=0;
		return Ans;
	}

	private static int Palindrome(int n) {
		// TODO Auto-generated method stub
		int b=n;
		int Ans=0;
		while(n>0) {
			int a=n%10;
			Ans=Ans*10+a;
			n=n/10;
		}
		
		if(b==Ans) 
			System.out.println("This no is palindrome");
		else Ans=0;
		return Ans;
		
	}

}
