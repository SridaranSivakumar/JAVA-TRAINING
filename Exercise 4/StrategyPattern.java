package CreationalPattern;
//Strategy Pattern
import java.util.Scanner;

public class StrategyPattern extends AnimeWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		AnimeWebsite website = new AnimeWebsite();
		System.out.println("Enter the Anime:");
		String string = scanner.nextLine();
		if (string.equalsIgnoreCase("OnePiece")) {
			website.anime = new OnePiece();
			website.anime.watchAnime();
		} else if (string.equalsIgnoreCase("Naruto")) {
			website.anime = new Naruto();
			website.anime.watchAnime();
		} else if (string.equalsIgnoreCase("DemonSlayer")) {
			website.anime = new DemonSlayer();
			website.anime.watchAnime();
		} else {
			System.out.println("Enter the correct name");
		}
	}
}
