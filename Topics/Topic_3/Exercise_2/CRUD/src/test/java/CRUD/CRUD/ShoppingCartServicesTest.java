package CRUD.CRUD;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This class will test the ShoppingCart methods
 * @author Diego Alvarez
 */

public class ShoppingCartServicesTest {

	/**
	 * This test method will test the addNewItem method
	 */
	@Test
	public void addNewItemTest(){
		Product item = new Product();
		ShoppingCartServicesImplementation cart = new ShoppingCartServicesImplementation();
		
		item.setId(1);
		item.setName("Tennis");
		item.setPrice(190000);
		item.setColor("Blue");
		item.setQuantity(3);
		cart.addNewItem(item);
		
		assertTrue(cart.products.contains(item));
		
	}
	
	/**
	 * This test method will test the deleteItem method 
	 */
	@Test
	public void deleteItemTest(){
		Product item = new Product();
		ShoppingCartServicesImplementation cart = new ShoppingCartServicesImplementation();
		
		item.setId(1);
		item.setName("Tennis");
		item.setPrice(190000);
		item.setColor("Blue");
		item.setQuantity(3);
		cart.addNewItem(item);
		cart.deleteItem(item);

		assertFalse(cart.products.contains(item));
	}
	
	/**
	 * This test method will test the changePrice method
	 */
	@Test
	public void changePriceTest(){
		Product item = new Product();
		ShoppingCartServicesImplementation cart = new ShoppingCartServicesImplementation();
		
		item.setId(1);
		item.setName("Tennis");
		item.setPrice(190000);
		item.setColor("Blue");
		item.setQuantity(3);
		cart.addNewItem(item);
		int price=200000;
		cart.changePrice(price, item.getId());
		
		assertEquals(price , cart.getProducts().get(0).getPrice());
		
	}
	
	/**
	 * This test method will test the changeColor method
	 */
	@Test
	public void changeColorTest(){
		Product item = new Product();
		ShoppingCartServicesImplementation cart = new ShoppingCartServicesImplementation();
		
		item.setId(1);
		item.setName("Tennis");
		item.setPrice(190000);
		item.setColor("Blue");
		item.setQuantity(3);
		cart.addNewItem(item);
		String color="Black";
		cart.changeColor(color, item.getId());
		
		assertEquals(color , cart.getProducts().get(0).getColor());
	}
	
	/**
	 * This test method will test the changeQuantity method
	 */
	@Test
	public void changeQuantityTest(){
		Product item = new Product();
		ShoppingCartServicesImplementation cart = new ShoppingCartServicesImplementation();
		
		item.setId(1);
		item.setName("Tennis");
		item.setPrice(190000);
		item.setColor("Blue");
		item.setQuantity(3);
		cart.addNewItem(item);
		int quantity =4;
		cart.changeQuantity(quantity, item.getId());
		
		assertEquals(quantity , cart.getProducts().get(0).getQuantity());
	}
}
