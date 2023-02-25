package Day1Task;



import java.util.Scanner;

public class Palindrome_15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int palindromenum=palindrome(n);
      int amstrongnum=amstrong(n);
      int perfectnum=perfectNum(n);
      if(palindromenum==0 && amstrongnum==0 && perfectnum==0){
    	  System.out.print("None of these");
      }
	}

	private static int perfectNum(int n) {
		// TODO Auto-generated method stub
		int ans=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				ans+=i;
			}
		}
		if(n==ans) System.out.println("This no is perfect num");
		else ans=0;
		return ans;
		
	}

	private static int amstrong(int n) {
		// TODO Auto-generated method stub
		int ans=0;
		int b=n;
		while(n>0) {
			int a=n%10;
			ans+=Math.pow(a, 3);
			n=n/10;
		}
		if(b==ans) 
			System.out.println("This no is Amstrong");
		else ans=0;
		return ans;
	}

	private static int palindrome(int n) {
		// TODO Auto-generated method stub
		int b=n;
		int ans=0;
		while(n>0) {
			int a=n%10;
			ans=ans*10+a;
			n=n/10;
		}
		
		if(b==ans) 
			System.out.println("This no is palindrome");
		else ans=0;
		return ans;
		
	}

}

