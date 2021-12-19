public class OrderItem { // represents an item purchased in an order
	
	// data members
	int quantity = 0;
	Product item = null;
	
	// constructor
	public OrderItem(int quantity, Product item) {
		this.quantity = quantity;
		this.item = item;
	}
	
	// getter and setter methods
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
	}
	
	
	public String summarize() {
		String str = "";
		if (item instanceof Hat) {
			Hat h = (Hat)item;
			str += quantity + " hats at $" + h.getPrice() + "\n";
			return str;
			
		} else if (item instanceof Bottle) {
			Bottle b = (Bottle)item;
			str += quantity + " bottles at $" + b.getPrice() + "\n";
			return str;
		}
		return str;
	}
	
	
	public double getCustomerTotal() {
		return(quantity * item.getPrice());
	}
	
	public double getCostTotal() {
		return(quantity * item.getCost());
	}

	
}
