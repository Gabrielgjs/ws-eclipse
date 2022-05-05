package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		return product.getName()
				+", "
				+ product.getPrice()
				+", Quantity: "
				+quantity
				+","
				+"Subtotal: "
				+ String.format("%.2f",  subTotal());
	}
	
	
}
