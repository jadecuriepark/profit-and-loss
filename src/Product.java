
public abstract class Product {
	
	double cost = 0.0; 
	int quantity = 0; 
	double price= 0.0;
	

	Product() {
		cost = 0.0;
		price = 0.0;
		quantity = 0;
	}
	
	Product(int q) {
		quantity = q; 
	}
	
	Product(double cost, double price) {
		cost = this.cost;
		price = this.price;
	}
	
	public double getPrice() {
		return price;
	}
	
   public void setPrice(double p) {
		price = p;
	}
   
   public double getCost() {
		return cost;
	}
	
  public void setCost(double c) {
	  cost = c;
	}
   

	/*
	public void outputProduct() {
		String str = "";
		str += "Product Details:";
		str += "\nCost : " + cost;
		str += "\nQuantity: " + quantity;
		System.out.println(str);
	}	*/


}
