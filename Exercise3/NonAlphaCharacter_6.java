package TaskDay5;

//TO check Alphabetic character else throw exception
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class NonAlphaCharacter_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine();
		CountingCharacters count = new CountingCharacters();
		executorService.execute(() -> {
			try {
				count.checking(str);
			} catch (NotACharacterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
class CountingCharacters {
	int count = 0;

	public void checking(String str) throws NotACharacterException {
		char[] splitstring = str.toCharArray();
		// try {
		for (int i = 0; i < splitstring.length; i++) {
			if (Character.isAlphabetic(splitstring[i])) {
				System.out.println(splitstring[i] + " " + "is the alphabatic character");
			} else {
				throw new NotACharacterException("This is not a character");
			}
		}
	}
}
class NotACharacterException extends Exception {
	String str;
	public NotACharacterException(String str) {
		// TODO Auto-generated constructor stub
		this.str = str;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str;
	}
}