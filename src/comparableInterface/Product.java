package comparableInterface;

public class Product implements Comparable<Product>{
private int id;
private String productName;
private int productPrice;
private int stock;
public Product(int id, String productName, int productPrice, int stock) {
	super();
	this.id = id;
	this.productName = productName;
	this.productPrice = productPrice;
	this.stock = stock;
}
public Product() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
@Override
public String toString() {
	return "Product [productName=" + productName + ", stock=" + stock + "]";
}
@Override
public int compareTo(Product o2) {
	// TODO Auto-generated method stub
	if(this.stock>o2.stock)
		return 1;
	else if(this.stock<o2.stock)
		return -1;
	else
		return 0;

}

}

