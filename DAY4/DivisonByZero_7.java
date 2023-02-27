package TaskDay4;

import java.util.Scanner;

public class DivisonByZero_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean val = true;
		int val1 = 0, val2 = 0, ans = 0;
		while (val) {
			System.out.println("Enter the Numerator :");
			String numerator = sc.nextLine();
			System.out.println("Enter the Denominator :");
			String denominator = sc.nextLine();
			val = check(numerator);
			if (val == false)
				break;
			try {
				val1 = Integer.parseInt(numerator);
				val2 = Integer.parseInt(denominator);
				ans = val1 / val2;
				System.out.println(ans);
			} catch (NumberFormatException ne) {
				// TODO: handle exception
				System.out.println("Enter the valid Number ");
				// ne.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		System.out.println("Loop breaks");

	}

	private static boolean check(String numerator) {
		if (numerator.equals("q") || numerator.equals("Q")) {
			return false;
		} else
			return true;

		// TODO Auto-generated method stub

	}
//number format exceptiuon	

}
