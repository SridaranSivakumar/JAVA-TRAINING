package CreationalPattern;

import java.util.ArrayList;
import java.util.List;

public class CommandPattern {
	public static void main(String[] args) {

		Flipkart Flipkart = new Flipkart();
		BuyMobile buyMobile = new BuyMobile(Flipkart);
		SellMobile sellMobile = new SellMobile(Flipkart);
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
	private Flipkart Flipkart;

	public BuyMobile(Flipkart Flipkart) {
		this.Flipkart = Flipkart;
	}

	public void execute() {
		Flipkart.buy();
	}
}

class SellMobile implements Order {
	private Flipkart Flipkart;

	public SellMobile(Flipkart Flipkart) {
		this.Flipkart = Flipkart;
	}

	public void execute() {
		Flipkart.sell();
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