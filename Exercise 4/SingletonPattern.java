package CreationalPattern;

class Singleton {
	private static Singleton single;

	private Singleton() {
		System.out.println("constructor");
	}

	public static Singleton createInstance() {
		if (single == null) {
			return new Singleton();
		} else {
			return single;
		}
	}
}

public class SingletonPattern{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton.createInstance();

	}

}
