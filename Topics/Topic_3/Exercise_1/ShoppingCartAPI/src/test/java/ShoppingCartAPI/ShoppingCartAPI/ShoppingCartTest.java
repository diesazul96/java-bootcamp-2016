package ShoppingCartAPI.ShoppingCartAPI;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This class will test the ShoppingCart methods
 * @author Diego Alvarez
 */

public class ShoppingCartTest {
	
	/**
	 * This test method will test the addNewItem method
	 */
	@Test
	public void addNewItemTest(){
		CartItem item = new CartItem();
		ShoppingCart cart = new ShoppingCart();
		
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
		CartItem item = new CartItem();
		ShoppingCart cart = new ShoppingCart();
		
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
	 * This test method will test the searchById method
	 */
	@Test
	public void searchByIdTest(){
		CartItem item = new CartItem();
		ShoppingCart cart = new ShoppingCart();
		
		item.setId(1);
		item.setName("Tennis");
		item.setPrice(190000);
		item.setColor("Blue");
		item.setQuantity(3);
		cart.addNewItem(item);
		
		assertEquals(cart.searchById(item.getId()), item);
		
	}
	
	/**
	 * This test method will test the searchByName method
	 */
	@Test
	public void searchByNameTest(){
		CartItem item = new CartItem();
		ShoppingCart cart = new ShoppingCart();
		
		item.setId(1);
		item.setName("Tennis");
		item.setPrice(190000);
		item.setColor("Blue");
		item.setQuantity(3);
		cart.addNewItem(item);
		
		assertEquals(item , cart.searchByName(item.getName()));
	}
	
	/**
	 * This test method will test the changePrice method
	 */
	@Test
	public void changePriceTest(){
		CartItem item = new CartItem();
		ShoppingCart cart = new ShoppingCart();
		
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
		CartItem item = new CartItem();
		ShoppingCart cart = new ShoppingCart();
		
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
		CartItem item = new CartItem();
		ShoppingCart cart = new ShoppingCart();
		
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
	
	/**
	 * This test method will test the totalPrice method
	 */
	@Test
	public void totalPriceTest(){
		CartItem item = new CartItem();
		CartItem item2 = new CartItem();
		ShoppingCart cart = new ShoppingCart();
		
		item.setId(1);
		item.setName("Tennis");
		item.setPrice(190000);
		item.setColor("Blue");
		item.setQuantity(3);
		cart.addNewItem(item);
		
		item2.setId(2);
		item2.setName("T-Shirt");
		item2.setPrice(90000);
		item2.setColor("White");
		item2.setQuantity(1);
		cart.addNewItem(item2);
		
		int total=660000;
		
		assertTrue(total == cart.totalPrice());
		
	}
	
	/**
	 * This test method will test the numberOfItems method
	 */
	@Test
	public void numberOfItemsTest(){
		CartItem item = new CartItem();
		CartItem item2 = new CartItem();
		ShoppingCart cart = new ShoppingCart();
		
		item.setId(1);
		item.setName("Tennis");
		item.setPrice(190000);
		item.setColor("Blue");
		item.setQuantity(3);
		cart.addNewItem(item);
		
		item2.setId(2);
		item2.setName("T-Shirt");
		item2.setPrice(90000);
		item2.setColor("White");
		item2.setQuantity(1);
		cart.addNewItem(item2);
		
		int num=4;
		
		assertEquals(num , cart.numberOfItems());		
	}

}