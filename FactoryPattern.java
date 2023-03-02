package CreationalPattern;

import java.util.Scanner;

public class FactoryPattern {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter anime name and language");
		String animeName = scanner.next();
		String language = scanner.next();
		AnimeWriter animeWriter = Anime1.animeName(animeName, language);
		animeWriter.drawAnime();
	}
}

class Anime1 {

	static AnimeWriter animeName(String animeName, String language) throws Exception {
		String format = "CreationalPattern.";
		AnimeBook animeBook = (AnimeBook) Class.forName(format.concat(language)).newInstance();
		AnimeWriter animeWriter = (AnimeWriter) Class.forName(format.concat(animeName)).newInstance();
		animeWriter.setAnime(animeBook);
		return animeWriter;
	}
}

abstract class AnimeWriter {
	abstract void setAnime(AnimeBook animeBook);

	abstract void drawAnime();
}

class Naruto1 extends AnimeWriter {
	AnimeBook animeBook;

	@Override
	void drawAnime() {
		// TODO Auto-generated method stub
		System.out.println("Naruto book");
		animeBook.diaplay();
	}

	@Override
	void setAnime(AnimeBook animeBook) {
		// TODO Auto-generated method stub
		this.animeBook = animeBook;
	}
}

class OnePiece1 extends AnimeWriter {
	AnimeBook animeBook;

	@Override
	void drawAnime() {
		// TODO Auto-generated method stub
		System.out.println("OnePiece book");
		animeBook.diaplay();
	}

	@Override
	void setAnime(AnimeBook animeBook) {
		// TODO Auto-generated method stub
		this.animeBook = animeBook;
	}
}

abstract class AnimeBook {
	abstract void diaplay();
}

class Japanese extends AnimeBook {
	@Override
	void diaplay() {
		// TODO Auto-generated method stub
		System.out.println("Anime in Japanese");
	}
}

class English extends AnimeBook {
	@Override
	void diaplay() {
		// TODO Auto-generated method stub
		System.out.println("Anime in English");
	}
}