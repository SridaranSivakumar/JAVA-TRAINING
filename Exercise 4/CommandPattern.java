package CreationalPattern;

import java.util.ArrayList;
import java.util.List;

public class CommandPattern {
	public static void main(String[] args) {

		Flipkart flipkart = new Flipkart();
		BuyMobile buyMobile = new BuyMobile(flipkart);
		SellMobile sellMobile = new SellMobile(flipkart);
		Broker broker = new Broker();
		broker.takeOrder(buyMobile);
		broker.takeOrder(sellMobile);
		broker.placeOrders();
	}
}

interface Order {
	void execute();
}

class Flipkart {

	private String name = "IQOO";
	private int quantity = 50000;

	public void buy() {
		System.out.println("Flipkart [ Name: " + name + ", Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Flipkart [ Name: " + name + ", Quantity: " + quantity + " ] sold");
	}
}

class BuyMobile implements Order {
	private Flipkart flipkart;

	public BuyMobile(Flipkart flipkart) {
		this.flipkart = flipkart;
	}

	public void execute() {
		flipkart.buy();
	}
}

class SellMobile implements Order {
	private Flipkart flipkart;

	public SellMobile(Flipkart flipkart) {
		this.flipkart = flipkart;
	}

	public void execute() {
		flipkart.sell();
	}
}

class Broker {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {

		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}