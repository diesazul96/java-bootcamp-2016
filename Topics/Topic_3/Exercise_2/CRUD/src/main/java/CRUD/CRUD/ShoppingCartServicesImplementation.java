package CRUD.CRUD;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will override the methods of the class that is implemented here
 * @author Diego Alvarez
 */

public class ShoppingCartServicesImplementation implements ShoppingCartServices{

	/**
	 * This is a class CartItem list of products
	 */
	List<Product> products=new ArrayList<Product>();
	
	/**
	 *This is an instance of the CartItem class 
	 */
	Product item = new Product();
	
	/**
	 * This method will return a list of products
	 * @return list of products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * This method will create a list of products
	 * @param list of products
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void addNewItem(Product item) {
		products.add(item);
		
	}

	public void deleteItem(Product item) {
		products.remove(item);
		
	}
	
	public void changePrice(int price, int id) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getId()==id) {
				products.get(i).setPrice(price);
				break;
			}
		}
	}

	public void changeColor(String color, int id) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getId()==id) {
				products.get(i).setColor(color);
				break;
			}
		}
	}

	public void changeQuantity(int quantity, int id) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getId()==id) {
				products.get(i).setQuantity(quantity);
				break;
			}
		}
	}
}
