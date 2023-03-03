package CreationalPattern;

class AnimeWebsite {
	Anime anime;

	public void visit() {
		anime.watchAnime();
	}
}

abstract class Anime {
	abstract void watchAnime();
}

class OnePiece extends Anime {

	@Override
	void watchAnime() {
		// TODO Auto-generated method stub
		System.out.println("Watching OnePiece");
	}

}

class Naruto extends Anime {

	@Override
	void watchAnime() {
		// TODO Auto-generated method stub
		System.out.println("Watching Naruto");
	}

}

class DemonSlayer extends Anime {

	@Override
	void watchAnime() {
		// TODO Auto-generated method stub
		System.out.println("Watching DemonSlayer");
	}

}