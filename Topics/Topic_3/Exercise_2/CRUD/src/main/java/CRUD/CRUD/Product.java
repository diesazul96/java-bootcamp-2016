package CRUD.CRUD;

/**
 * @author Diego Alvarez
 * This class will define the attributes and methods that characterize a product in a shopping cart
 */

public class Product {
	/**
	 * product id
	 */
	private int id;
	
	/**
	 * product name
	 */
	private String name;
	
	/**
	 * product price
	 */
	private int price;
	
	/**
	 * quantity of the same product
	 */
	private int quantity;
	
	/**
	 * product color
	 */
	private String color;
	
	/**
	 * gets the id of the product
	 * @return an integer as an a id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * sets the value of the id
	 * @param an integer as an a id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * gets the name of the product
	 * @return an String as the name of the product
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * sets the name of the product
	 * @param a String as the name of the product
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * gets the price of the product
	 * @return an integer as the price of the product
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * sets the price of the product
	 * @param an integer as the price of the product
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * gets the quantity of the product
	 * @return an integer as the quantity of the product
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * sets the quantity of the product
	 * @param an integer as the quantity of the product
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * gets the color of the product
	 * @return an String as the color of the product
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * sets the color of the product
	 * @param an String as the color of the product
	 */
	public void setColor(String color) {
		this.color = color;
	}
}
