package Day1Task;

import java.util.Scanner;

public class AverageofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int Answer=calculate(N);
      System.out.println(Answer);
      }
	private static int calculate(int n) {
     int Ans=(n*(n+1)/2)/n;
		return Ans;
	}
	}
