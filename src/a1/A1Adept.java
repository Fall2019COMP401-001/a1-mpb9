package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfItems = scan.nextInt();
		
		String[] items = new String[numberOfItems];
		double[] prices = new double[numberOfItems];
		
		for (int i=0; i < numberOfItems; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextInt();
		}
		
		int numberOfCustomers = scan.nextInt();
		
		String[] customers = new String[numberOfCustomers];
		double[] subtotals = new double[numberOfCustomers];
		
		for (int i=0; i < numberOfCustomers; i++) {
			customers[i] = (scan.next() + " " + scan.next());
			
			int purchased = scan.nextInt();
			double charge = 0;
			
			for (int j=0; j < purchased; j++) {
				int quantity = scan.nextInt();
				String item = scan.next();
				int index = 0;
				for (int k=0; k < items.length; k++) {
					if ((items[k]).equals(item)) {
						index = k;
					}
				}	
			double itemBought = prices[index];
			charge = (quantity * itemBought) + charge;
			subtotals[i] = charge;
			}
			
		}
		
		int indexBiggest = 0;
		int indexSmallest = 0;
		double biggest = subtotals[0];
		double smallest = subtotals[0];
		
		for (int i = 0; i < subtotals.length; i++) {
			if (subtotals[i] > biggest) {
				biggest = subtotals[i];
				indexBiggest = i;
			}
			if (subtotals[i] < smallest) {
				smallest = subtotals[i];
				indexSmallest = i;
			}
		}
		
		double average = 0;
		for (int i = 0; i < subtotals.length; i++) {
			average = average + subtotals[i];
		}
		average = average /subtotals.length;
		
		System.out.println("Biggest: " + customers[indexBiggest] + " (" + String.format("%.2f", subtotals[indexBiggest]) + ")");
		System.out.println("Smallest: " + customers[indexSmallest] + " (" + String.format("%.2f", subtotals[indexSmallest]) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		}

	
}
