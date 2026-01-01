package tostringEquals;

import java.util.Objects;

public class Product {
 private int id;
 private String name;
 private int price;
 public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int id, String name, int price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return name;
}
@Override
public int hashCode() {
	return Objects.hash(name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return Objects.equals(name, other.name);
}

 
}
