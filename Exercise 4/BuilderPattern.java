package CreationalPattern;

public class BuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop.BuildShop().setbuiscuit("oreo").setchoclate("DairyMilk").setsoap("pears")
				.settoothbrush("colgate").build();
		System.out.println(shop);
	}

}

class Shop {
	class ShopProducts {
		String choclate, biscuit, soap, toothbrush;

		ShopProducts(String choclate, String biscuit, String soap, String toothbrush) {
			this.choclate = choclate;
			this.biscuit = biscuit;
			this.soap = soap;
			this.toothbrush = toothbrush;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return " Choclate : " + choclate + " Biscuit : " + biscuit + " Soap : " + soap + " ToothBrush : " + toothbrush;
		}
	}

	ShopProducts product;
	String shopname = "Nachi";

	public Shop(BuildShop bs) {
		product = new ShopProducts(bs.choclate, bs.biscuit,bs.soap, bs.toothbrush);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shop : " + product + "   Shop Name : " + shopname;
	}

	static class BuildShop {
		String choclate, biscuit, soap, toothbrush;

		public BuildShop setchoclate(String choclate) {
			this.choclate = choclate;
			return this;
		}

		public BuildShop setbuiscuit(String biscuit) {
			this.biscuit = biscuit;
			return this;
		}

		public BuildShop setsoap(String soap) {
			this.soap = soap;
			return this;
		}

		public BuildShop settoothbrush(String toothbrush) {
			this.toothbrush = toothbrush;
			return this;
		}

		public Shop build() {
			return new Shop(this);
		}
	}

}