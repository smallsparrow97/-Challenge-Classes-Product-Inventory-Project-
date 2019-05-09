package pk;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	
	ArrayList<Product> listProduct = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public void addProduct(int id, double price, int quantity) {
		Product product = new Product(id, price, quantity);
		listProduct.add(product);
	}
	
	public boolean addProduct() {
		boolean conditionId = true;
		boolean conditionPrice = true;
		boolean conditionQuantity = true;
		int id = 0;
		double price = 0;
		int quantity = 0;
		
		while (conditionId) {
			System.out.print("Enter id: ");
			try {
				id = Integer.parseInt(sc.nextLine());
				if (!checkId(id)) {
					System.out.println("This id already exists!");
				} else {
					conditionId = false;
				}
			} catch (Exception e) {
				System.out.println("Invalid id!");
				//System.out.println(e.getMessage());
			}
			
		}
		
		while (conditionPrice) {
			System.out.print("Enter price: ");
			try {
				price = Double.parseDouble(sc.nextLine());
				if (price > 0) {
					conditionPrice = false;
				} else {
					System.out.println("Invalid price!");
				}
				
			} catch (Exception e) {
				System.out.println("Invalid price!");
				//System.out.println(e.getMessage());
			}
			
		}
		
		while (conditionQuantity) {
			System.out.print("Enter quantity: ");
			try {
				quantity = Integer.parseInt(sc.nextLine());
				if (quantity >= 0) {
					conditionQuantity = false;
				} else {
					System.out.println("Invalid quantity!");
				}
				
			} catch (Exception e) {
				System.out.println("Invalid quantity!");
				//System.out.println(e.getMessage());
			}
			
		}
		
		Product objProduct = new Product(id, price, quantity);
		listProduct.add(objProduct);
		return true;
	}
	
	private boolean checkId(int id) {
		for (Product product : listProduct) {
			if (id == product.getId()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean removeProduct() {
		//int idRemove = 0;
		System.out.print("Enter id of product you want to remove: ");
		try {
			int idRemove = Integer.parseInt(sc.nextLine());
			for (Product product : listProduct) {
				if (idRemove == product.getId()) {
					listProduct.remove(product);
					return true;
				} 
			}
			return false;
			
		} catch (Exception e) {
			System.out.println("Invalid id!");
			return false;
		}
	}

	public void displayListProduct() {
		for (Product product : listProduct) {
			System.out.println(product);
		}
	}

	public int sumInventory() {
		int sum = 0;
		for (Product product : listProduct) {
			sum += product.getQuantity()*product.getPrice();
		}
		return sum;
	}

	
	
}
