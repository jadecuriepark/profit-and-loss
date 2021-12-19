// Unit 4 Assignment: Profit and loss calculations - Jade Park (9-12-2021)
import java.util.Scanner;

public class Assignment4 {

	static Accounting newAccounting = new Accounting();
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Starr's profit and loss calculator!");
		
		System.out.println("\nConfigure Hats:");
		System.out.print("selling price: ");
		double hPrice = input.nextDouble();
		System.out.print("cost to company: ");
		double hCost = input.nextDouble();
		
		System.out.println("\nConfigure Bottles:");
		System.out.print("selling price: ");
		double bPrice = input.nextDouble();
		System.out.print("cost to company: ");
		double bCost = input.nextDouble();
		
		
		System.out.print("\nHow many orders will you be entering? ");
		int numberOfOrders = input.nextInt();
		
		Order newOrder = new Order();
		
		for (int i = 0; i < numberOfOrders; i++) {
			
			newOrder.setOrderNumber(i+1);
			
			System.out.print("Order " + (i+1) + " - Which product? ");
			String name = input.next();
			
			if (name.equals("hat")) {
				
				System.out.print("Order " + (i+1) + " - Quantity? ");
				int quantity = input.nextInt();
				
				Product h = new Hat(quantity, hCost, hPrice);
				OrderItem newOI = new OrderItem(quantity, (Product)h);
				
				newOrder.addOrderItem(newOI);
				

			} else if (name.equals("bottle")) {
				
				System.out.print("Order " + (i+1) + " - Quantity? ");
				int quantity = input.nextInt();
				
				Product b = new Bottle(quantity, bCost, bPrice);
				OrderItem newOI = new OrderItem(quantity, (Product)b);
				
				newOrder.addOrderItem(newOI);
				
			}
			
			
		}
		
		
		// order summarization
		System.out.println("\nOrder summarization:");
		System.out.println("********************************** ");
		newAccounting.addOrderItem(newOrder);
		newAccounting.summarize();
					

		// profit and Loss calculation
		double profit;
		profit = newAccounting.calculateProfitOrLoss();

		System.out.println("\nProfit and loss calculation: ");
		System.out.println("********************************** ");
		
		if (profit > 0) {
			System.out.println("You have made a profit amount of $" + profit);
		} else if (profit < 0) {
			System.out.println("You have lost $" + Math.abs(profit));
		} else {
			System.out.println("This order comes out to neither a profit nor a loss.");
		}

		
	}

}
