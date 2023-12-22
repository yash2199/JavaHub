package vehicle_management;

public enum color {
	WHITE(5000), BLACK(10000), RED(2000), GREY(6000);

	private double price;

	private color(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
