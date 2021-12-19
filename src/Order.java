public class Order { // allows the user to order products 
	
	
	int orderNumber;
	int numberOfOrderItems = 0;
	OrderItem orderItemsArray[] = new OrderItem[10];
	
	public void addOrderItem(OrderItem newItem) {
		orderItemsArray[numberOfOrderItems++] = newItem; 
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int number) {
		orderNumber = number;
	}

	public double getCustomerTotal() {
		 //double totalCost = 0.0;
		 double customerTotal = 0.0;

		for (int i = 0; i < numberOfOrderItems; i++) {
			customerTotal += orderItemsArray[i].getCustomerTotal();	
		}
		
		return customerTotal;

	}
	
	public double getCostTotal() {
		 double totalCost = 0.0;
		 //double customerTotal = 0.0;

		for (int i = 0; i < numberOfOrderItems; i++) {
			totalCost += orderItemsArray[i].getCostTotal();	
		}
		
		return totalCost;
		
	}


	
	
	public String summarize() { // output a summary of order information
		OrderItem orderItem;
		String str = "";
		// string builder
	    
		for (int i = 0; i < numberOfOrderItems; i++) {
			orderItem = this.orderItemsArray[i]; 
			if (i == 0) {
				str += orderItem.summarize();
			} else if (i > 0) {
				if (this.orderItemsArray[i] != this.orderItemsArray[i-1]) {
					str += orderItem.summarize();	
				}
			}
		}
		
		str += "Order customer total = $" + getCustomerTotal() + "\n";
		str += "Order cost total = $" + getCostTotal() + "\n";

		return str;

		
	}
}
