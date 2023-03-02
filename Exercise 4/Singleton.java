package CreationalPattern;

class SingletonObject {
	private static SingletonObject s;

	private SingletonObject() {
		System.out.println("constructor");
	}

	public static SingletonObject createInstance() {
		if (s == null) {
			return new SingletonObject();
		} else {
			return s;
		}
	}
}

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonObject.createInstance();

	}

}
