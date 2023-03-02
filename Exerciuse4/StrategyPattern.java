package CreationalPattern;
//Strategy Pattern
import java.util.Scanner;

public class StrategyPattern extends AnimeWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AnimeWebsite website = new AnimeWebsite();
		System.out.println("Enter the Anime:");
		String str = sc.nextLine();
		if (str.equalsIgnoreCase("OnePiece")) {
			website.anime = new OnePiece();
			website.anime.watchAnimae();
		} else if (str.equalsIgnoreCase("Naruto")) {
			website.anime = new Naruto();
			website.anime.watchAnimae();
		} else if (str.equalsIgnoreCase("DemonSlayer")) {
			website.anime = new DemonSlayer();
			website.anime.watchAnimae();
		} else {
			System.out.println("Enter the correct name");
		}
	}
}
