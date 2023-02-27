package TaskDay4;

import java.util.Scanner;

public class NewException_4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age :");
		int age = sc.nextInt();
		try {
			checkingAge(age);

		} catch (InvalidAgeException e) {
			e.printStackTrace();
			// System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void checkingAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be above 18 and not valid for voting");
		} else {
			System.out.println("Valid Age for voting");
		}
	}

}

class InvalidAgeException extends Exception {
	String str;

	public InvalidAgeException(String string) {
		// TODO Auto-generated constructor stub
		this.str = string;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return this.str;
	}

}