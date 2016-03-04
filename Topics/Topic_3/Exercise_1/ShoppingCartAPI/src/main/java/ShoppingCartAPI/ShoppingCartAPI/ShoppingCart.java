package ShoppingCartAPI.ShoppingCartAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will override the methods of the class that is implemented here
 * @author Diego Alvarez
 */

public class ShoppingCart implements ShoppingServices{
	
	/**
	 * This is a class CartItem list of products
	 */
	List<CartItem> products=new ArrayList<CartItem>();
	
	/**
	 *This is an instance of the CartItem class 
	 */
	CartItem item = new CartItem();
	
	/**
	 * This method will return a list of products
	 * @return list of products
	 */
	public List<CartItem> getProducts() {
		return products;
	}

	/**
	 * This method will create a list of products
	 * @param list of products
	 */
	public void setProducts(List<CartItem> products) {
		this.products = products;
	}

	public void addNewItem(CartItem item) {
		products.add(item);
		
	}

	public void deleteItem(CartItem item) {
		products.remove(item);
		
	}

	public CartItem searchById(int id) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getId()==id) {
				item=products.get(i);
				break;
			}
		}
		return item;
	}

	public CartItem searchByName(String name) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getName()==name) {
				item=products.get(i);
				break;
			}
		}
		return item;
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

	public int totalPrice() {
		int total=0;
		int acum=0;
		for (int i = 0; i < products.size(); i++) {
			acum=products.get(i).getPrice()*products.get(i).getQuantity();
			total=total+acum;
		}
		return total;
	}

	public int numberOfItems() {
		int quantity=0;
		for (int i = 0; i < products.size(); i++) {
			quantity=quantity + products.get(i).getQuantity();
		}
		
		return quantity;
	}

}