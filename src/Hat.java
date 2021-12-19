
public class Hat extends Product {
	
	// attributes
			int quantity = 0;
		    double cost = 0.0;
			double price = 0.0;
				
			// constructor
			public Hat(int quantity, double cost, double price) {
				super(quantity);
				this.cost = cost;
				this.price = price;
			}
		
	// getter and setter methods
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
