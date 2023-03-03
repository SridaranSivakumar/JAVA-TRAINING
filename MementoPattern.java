package BehaviouralPattern;

import java.util.ArrayList;
import java.util.List;

class Memento {
	private String mobilename;
	private int price;

	public Memento(String mobilename, int price) {
		this.mobilename = mobilename;
		this.price = price;
	}

	public String getMobileName() {
		return mobilename;
	}

	public int getPrize() {
		return price;
	}
}

class Mobile {
	private String mobilename;
	private int price;

	public Mobile(String mobilename, int price) {
		this.mobilename = mobilename;
		this.price = price;
		System.out.println(String.format("create: mobilename = %s, price = %s", mobilename, price));
	}

	public Memento save() {
		System.out.println(String.format("save: mobilename = %s, price = %s", mobilename, price));
		return new Memento(mobilename, price);
	}

	public void restore(Memento memento) {
		mobilename = memento.getMobileName();
		price = memento.getPrize();
		System.out.println(String.format("restore: mobilename = %s, price = %s", mobilename, price));
	}
}

class SaveMobile {
	private List<Memento> list = new ArrayList<Memento>();

	public void add(Memento memento) {
		list.add(memento);
	}

	public Memento get(int ind) {
		return list.get(ind);
	}
}

public class MementoPattern { // Test
	public static void main(String[] args) {
		SaveMobile saveMobile = new SaveMobile();
		Mobile Mobile1 = new Mobile("IQOO", 40000);
		Mobile Mobile2 = new Mobile("Realme",30000);
		saveMobile.add(Mobile1.save());
		Mobile1.restore(saveMobile.get(0));
	}

}
