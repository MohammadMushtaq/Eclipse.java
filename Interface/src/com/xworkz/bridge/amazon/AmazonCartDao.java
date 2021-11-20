package com.xworkz.bridge.amazon;

public interface AmazonCartDao {
	
	boolean save(CartDTO cartDto);
	
	CartDTO findByName(String name);
	
	void displayAllCarDetails();
	
}


/*default void displayAllCarDetails() {}
 * in interface class use the default method and implementation class dont force to implement
 * the methos "ie;-rule is when we use any methos in interface the implemt class forcefully
 * it add the method other wise it would not be work.
 */

 