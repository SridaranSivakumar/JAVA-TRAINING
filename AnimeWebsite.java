package CreationalPattern;

class AnimeWebsite {
	Anime anime;

	public void visit() {
		anime.watchAnimae();
	}
}

abstract class Anime {
	abstract void watchAnimae();
}

class OnePiece extends Anime {

	@Override
	void watchAnimae() {
		// TODO Auto-generated method stub
		System.out.println("Watching OnePiece");
	}

}

class Naruto extends Anime {

	@Override
	void watchAnimae() {
		// TODO Auto-generated method stub
		System.out.println("Watching Naruto");
	}

}

class DemonSlayer extends Anime {

	@Override
	void watchAnimae() {
		// TODO Auto-generated method stub
		System.out.println("Watching DemonSlayer");
	}

}