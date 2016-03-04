package CRUD.CRUD;

/**
 * This interface will define the methods of the services that may offer a shopping cart
 * @author Diego Alvarez
 */

public interface ShoppingCartServices {
	/**
	 * This method will add an item to a list
	 * @param item class CartItem
	 */
	public void addNewItem(Product item);
	
	/**
	 * This method will delete an item from a list
	 * @param item class CartItem
	 */
	public void deleteItem(Product item);
	
	/**
	 * This method will change the value of the price of the product
	 * @param integer price
	 * @param integer id
	 */
	public void changePrice(int price, int id);
	
	/**
	 * This method will change the color of the product
	 * @param String color
	 * @param integer id
	 */
	public void changeColor(String color, int id);
	
	/**
	 * This method will change the value of the quantity of the product
	 * @param integer quantity
	 * @param integer id
	 */
	public void changeQuantity(int quantity, int id);
}
