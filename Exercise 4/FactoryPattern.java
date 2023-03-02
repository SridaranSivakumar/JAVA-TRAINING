package CreationalPattern;

import java.util.Scanner;

public class FactoryPattern {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter anime name and language");
		String animeName = scanner.next();
		String language = scanner.next();
		AnimeWriter animeWriter = Anime.createAnime(animeName, language);
		animeWriter.drawAnime();
	}
}

class Anime {

	static AnimeWriter createAnime(String animeName, String language) throws Exception {
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

class Naruto extends AnimeWriter {
	AnimeBook animeBook;

	@Override
	void drawAnime() {
		// TODO Auto-generated method stub
		System.out.println("Naruto book");
		animeBook.display();
	}

	@Override
	void setAnime(AnimeBook animeBook) {
		// TODO Auto-generated method stub
		this.animeBook = animeBook;
	}
}

class OnePiece extends AnimeWriter {
	AnimeBook animeBook;

	@Override
	void drawAnime() {
		// TODO Auto-generated method stub
		System.out.println("OnePiece book");
		animeBook.display();
	}

	@Override
	void setAnime(AnimeBook animeBook) {
		// TODO Auto-generated method stub
		this.animeBook = animeBook;
	}
}

abstract class AnimeBook {
	abstract void display();
}

class Japanese extends AnimeBook {
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Anime in Japanese");
	}
}

class English extends AnimeBook {
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Anime in English");
	}
}