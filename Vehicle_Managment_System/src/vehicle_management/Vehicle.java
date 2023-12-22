package vehicle_management;

import java.time.LocalDate;
import vehicle_management.color;

public class Vehicle {
	private String chasis_no;
	private String company;
	private boolean isAvailable;
	private color color;
	private double base_price;
	private LocalDate manufactureDate;

	public Vehicle(String chasis_no, String company, boolean isAvailable, vehicle_management.color color,
			double base_price, LocalDate manufactureDate) {
		super();
		this.chasis_no = chasis_no;
		this.company = company;
		this.isAvailable = isAvailable;
		this.color = color;
		this.base_price = base_price + color.getPrice();
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Vehicle [chasis_no=" + chasis_no + ", company=" + company + ", isAvailable=" + isAvailable + ", color="
				+ color + ", base_price=" + base_price + ", manufactureDate=" + manufactureDate + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vehicle) {
			Vehicle V = (Vehicle) obj;
			return this.chasis_no.equals(V.chasis_no);
		}
		return false;
	}

}
