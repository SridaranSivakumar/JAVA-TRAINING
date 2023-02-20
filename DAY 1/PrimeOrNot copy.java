package Day1Task;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int N=sc.nextInt();
        for(int i=2;i<=N/2;i++) {
        	if(N%i==0){
        	  flag=1;
        	  break;
        }
	}
if(flag==1) System.out.println("This is not a prime");
else System.out.println("This is prime");
}
}
