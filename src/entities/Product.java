package entities; //Entidade do meu negocio

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		super();
	}

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return this.getPrice() * this.getQuantity();
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return name + 
	           ", $" 
	           + String.format("%.2f", price) +
	           ", " 
	           + quantity 
	           + " units, Total: $"
	           + String.format("%.2f", totalValueInStock());
	}
	
	
}
