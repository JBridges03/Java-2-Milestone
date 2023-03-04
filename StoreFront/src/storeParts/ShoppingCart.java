/**
 * 
 */
package storeParts;
import java.util.*;

/**
 * @author Joshua Bridgeschase
 *
 */
public class ShoppingCart
{
public static ArrayList<Salable> shoppingCart;


// This method is responsible for displaying the items currently in the shopping cart
public void itemDisplay()
{
	// This displays the items currently in the shopping cart
	System.out.println("These are the items currently in your cart: ");
	System.out.println(shoppingCart.toString());
	
	

}

// This method is responsible for removing a purchased item from the cart
public void cancelPurchase()
{
	System.out.println("You have canceled your purchase.");
	shoppingCart.remove(0);

}



}
