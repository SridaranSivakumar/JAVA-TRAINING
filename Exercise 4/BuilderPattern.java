package CreationalPattern;

public class BuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop.BuildShop().setBuiscuit("oreo").setChoclate("DairyMilk").setSoap("pears")
				.setToothBrush("colgate").build();
		System.out.println(shop);
	}

}

class Shop {
	class ShopProducts {
		String choclate, biscuit, soap, toothBrush;

		ShopProducts(String choclate, String biscuit, String soap, String toothBrush) {
			this.choclate = choclate;
			this.biscuit = biscuit;
			this.soap = soap;
			this.toothBrush = toothBrush;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return " Choclate : " + choclate + " Biscuit : " + biscuit + " Soap : " + soap + " ToothBrush : " + toothBrush;
		}
	}

	ShopProducts product;
	String shopName = "Nachi";

	public Shop(BuildShop bs) {
		product = new ShopProducts(bs.choclate, bs.biscuit,bs.soap, bs.toothBrush);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shop : " + product + "   Shop Name : " + shopName;
	}

	static class BuildShop {
		String choclate, biscuit, soap, toothBrush;

		public BuildShop setChoclate(String choclate) {
			this.choclate = choclate;
			return this;
		}

		public BuildShop setBuiscuit(String biscuit) {
			this.biscuit = biscuit;
			return this;
		}

		public BuildShop setSoap(String soap) {
			this.soap = soap;
			return this;
		}

		public BuildShop setToothBrush(String toothBrush) {
			this.toothBrush = toothBrush;
			return this;
		}

		public Shop build() {
			return new Shop(this);
		}
	}

}