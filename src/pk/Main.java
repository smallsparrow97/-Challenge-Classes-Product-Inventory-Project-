package pk;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Inventory i = new Inventory();

		i.addProduct(1, 20000.0, 5);
		i.addProduct(2, 50000.0, 3);
		i.addProduct(3, 10000.0, 10);
		
		Scanner sc = new Scanner(System.in);
		boolean condition = true;

		while (condition) {
			System.out.println("---------------MENU------------------");
			System.out.println("|1. Add a new product into inventory|");
			System.out.println("|2. Remove a product from inventory |");
			System.out.println("|3. Show all product in inventory   |");
			System.out.println("|4. Sum up the inventory value      |");
			System.out.println("|0. Exit			    |");
			System.out.println("-------------------------------------");
			
			System.out.print("Key: ");
			
			String key = sc.nextLine();

			switch (key) {
			case "1":
				if (i.addProduct()) {
					System.out.println("Add product successful!");
				}
				break;
			case "2":
				if (i.removeProduct()) {
					System.out.println("Remove product successful!");
				} else {
					System.out.println("Not found!");
				}
				break;
			case "3":
				i.displayListProduct();
				break;
			case "4":
				System.out.println("Sum up the inventory value: " + i.sumInventory());
				break;
			case "0":
				System.out.println("Goodbye!");
				condition = false;
				break;
			default:
				System.out.println("Please enter again!");
				break;
			}

		}	

	}

}
