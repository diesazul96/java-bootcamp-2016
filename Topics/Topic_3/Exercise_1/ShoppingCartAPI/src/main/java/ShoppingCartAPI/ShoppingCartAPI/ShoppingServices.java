package ShoppingCartAPI.ShoppingCartAPI;

/**
 * This interface will define the methods of the services that may offer a shopping cart
 * @author Diego Alvarez
 */

public interface ShoppingServices {
	
	/**
	 * This method will add an item to a list
	 * @param item class CartItem
	 */
	public void addNewItem(CartItem item);
	
	/**
	 * This method will delete an item from a list
	 * @param item class CartItem
	 */
	public void deleteItem(CartItem item);
	
	/**
	 * This method will search an item in the list using its id
	 * @param integer id
	 * @return an item class CartItem
	 */
	public CartItem searchById(int id);
	
	/**
	 * This method will search an item in the list using its name
	 * @param String name
	 * @return an item class CartItem
	 */
	public CartItem searchByName(String name);
	
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
	
	/**
	 * This method will return the value of the sum of the price of each product according to its quantity
	 * @return an integer as the value of the sum 
	 */
	public int totalPrice();
	
	/**
	 * This method will return the number of products
	 * @return an integer as the total number of products
	 */
	public int numberOfItems();

}
