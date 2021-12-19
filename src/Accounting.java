import java.util.ArrayList;

public class Accounting implements Calculate {

	public Order ordersArray[] = new Order[10];
	int numberOfOrders = 0;

	//add summarize method to implement the calculate interface method
	  
	public void summarize() {
		Order o;
		//iterate through the order array and invoke the summarize for each order object
		//at the end of the for loop we will see multiple lines like this "Order 1: 3 hiking boots at $80.00"
		
		for (int i = 0; i < numberOfOrders; i++) {
			o = ordersArray[i];
			System.out.println(o.summarize());
		}
		
	}
	
	public void addOrderItem(Order newItem) {
		//adding new order item into the array
		ordersArray[numberOfOrders++] = newItem; 
	}
	
	public double getCustomerTotal() {
		 double totalCost = 0.0;
		  double customerTotal = 0.0;
		Order o;
		//iterate through orderItems array and add to customer total
		for (int i = 0; i < numberOfOrders; i++) {
			//Order 1: 3 hiking boots at $80.00  
			//from oi.summarize, we will get the "3 hiking boots at $80.00" part of the string
			o = ordersArray[i]; 
			customerTotal = customerTotal + o.getCustomerTotal();	
		}
		return customerTotal;
	}
	
	public double getTotalCost() {
		 double totalCost = 0.0;
		  double customerTotal = 0.0;
		Order o;
		//iterate through orderItems array and add to cost total
		for (int i = 0; i < numberOfOrders; i++) {
			//Order 1: 3 hiking boots at $80.00  
			//from oi.summarize, we will get the "3 hiking boots at $80.00" part of the string
			o = ordersArray[i]; 
			totalCost = totalCost + o.getCostTotal();	
		}
		return totalCost;
	}
	
	public double calculateProfitOrLoss() {
		double profit = getCustomerTotal() - getTotalCost();
		return profit;
	}


	
}
