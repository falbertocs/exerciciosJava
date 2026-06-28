package logica;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	// Operação para devolver o valor do estoque 
	public double totalValueInStock() {
		return price * quantity;
	} 
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}

 //Qual a diferença de parametro para argumento?
