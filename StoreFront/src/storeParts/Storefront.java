/**
 * 
 */
package storeParts;



/**
 * @author Joshua Bridges
 *
 */
public class Storefront
{
	// Driver Method
	public static void main(String[] args) 
	{
		//Storefront storeFront = new Storefront();
		
	
		// Instantiated Inventory Manager class
		InventoryManager stockManager = new InventoryManager();
		
		//Instantiataed Shopping Cart class
		ShoppingCart shoppingCart = new ShoppingCart();
		
		
		
		
		
		// Introduction Message
		System.out.println("Welcome to Josh's Wonder Store!"); // Introduction Message
		
		// Prints the  Store Menu
		System.out.println(InventoryManager.storeMenu());
		
		
		
		System.out.println("These are the menu categories: "); // Category Selection Prompt
		
		
		// Print Inventory
		stockManager.addtoList();
		System.out.println(stockManager.printInv());
		
		
		
		
		

	
		
		
		
		
		
	    
	  //  System.out.println("You Chose: ");  // Print item selection
		
		
		

	}

	
  
		
	}
	
	
	
	


