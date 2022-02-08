package application; 
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data: ");
		
		System.out.print("Nome: ");
	    String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quanty in stock: ");
		int quantity = sc.nextInt();
		
		Product p1 = new Product(name, price, quantity);
		
		System.out.println("\nProduct data: " + p1);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		p1.addProducts(quantity);
		
		System.out.println("\nUpdated data: " + p1);
    
		System.out.print("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		p1.removeProducts(quantity);
		
		System.out.println("\nUpdated data: " + p1);

			
		sc.close();
	
	}
	    
	    
	
	

}
