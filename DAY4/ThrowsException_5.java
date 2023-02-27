package TaskDay4;

import java.util.Scanner;

public class ThrowsException_5 {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age :");
		int age = sc.nextInt();
		if (age > 24) {
			throw new InvalidAgeException("You are not eligile for student offer");
		} else {
			System.out.println("You are eligible for student offer");
		}
	}
}

//age class