/**
 * 
 */
package storeParts;
import java.util.*;


/**
 * @author Joshua Bridges
 * This is my own work 
 * with the exception of the storeMenu from stackOverflow
 */
public class InventoryManager
{
	public static ArrayList<Salable> salableItems = new ArrayList<>();
	//public ArrayList<Salable> inv = new ArrayList<>();

	
	

	/**
	 * This is the constructor
	 * */
	public InventoryManager()
	{
		super();
		// Instantiate the ArrayLists
		salableItems = new ArrayList<Salable>();
		
		
		
	}


	

	public void addtoList() 
	// Add items to the salable list
	{
		Weapon  item1 =  new Weapon("Weapon", "Bowie Knife", "An almost sword like knife" , 45.00,10, "Melee", "None", "Small");
		Weapon  item2 = new Weapon("Weapon","FN-57","An Italian made handgun known for its reliability ",80.00,15, "Ranged", "45 ACP", "Small");
		Armor  item3 = new Armor("Armor","Cowl","a long hooded clothing item with wide sleeves",10.00,8, "Light-Armor", 5);
		Armor  item4 = new Armor("Armor","Ballistic Vest","A vest made for absorbing the impact of bullets or other projectiles ",12.50,10, "Medium-Armor", 25);
		Health item5 = new Health("Health", "Standard Health Potion", "An average health potion", 5.00, 10, 20);
		Health item6 = new Health("Health", "Greater Health Potion", "A greater than average health potion", 5.00, 10, 20);
		
		salableItems.add(item1);
		salableItems.add(item2);
		salableItems.add(item3);
		salableItems.add(item4);
		salableItems.add(item5);
		salableItems.add(item6);
	
		
		
		

	}
	
	/**
	 * This method is responsible for printing the arraylist
	 * 
	 */
	public String printInv()
	{
		System.out.println("These are the General inventory items: ");
		String genInventory = "";
		for(int i = 0; i < salableItems.size(); i++)
		{
			genInventory += salableItems.get(i).toString();
			genInventory += "\n";
		}
		return genInventory;
		
	}

	public void purchase()
	{
		int s = 0;
		
		String genInventory = salableItems.toString();
		for(int i = 0; i < salableItems.size(); i++)
		{
			genInventory += salableItems.get(i).toString();
			genInventory += "\n";
		}
		
		salableItems.get(s); 
		ShoppingCart.shoppingCart.add(0, null);
	}
	
public static String storeMenu()
{
	Scanner input = new Scanner(System.in);
	 int menuSelection;
	System.out.println("Please an option from the menu using an integer");
	
	   System.out.println("Option 1: Quit Application (0)");
	
	   System.out.println("Option 2: Show Current Stock (1)");
	   
	   
	   System.out.println(" Option 3:Show Shopping Cart :");
	   
	   
	   System.out.println("Option 4: Purchase an item");
	   
	   System.out.println("Option 5: Cancel purchase");

	   menuSelection = -1;
	   menuSelection = input.nextInt();
	   
	
	////////////////////////////////////////
	
	while(menuSelection != 0)
	{
		try
		{
			switch(menuSelection)
			{
			case 0:
			      System.out.println("Quit Application");
			      System.exit(0);
			      break;
			      
			case 1:
				String currentInventory = "";
				for(int i = 0; i < salableItems.size(); i++)
				{
					currentInventory += salableItems.get(i).toString();
					currentInventory += "\n";
				}
			
				System.out.println(currentInventory);
				return currentInventory;
				
			
				
			case 2:
				System.out.println("Show Shopping Cart :");
				String shoppingCart = "";
				for(int i = 0; i < ShoppingCart.shoppingCart.size(); i++)
				{
					shoppingCart += ShoppingCart.shoppingCart.get(i).toString();
					shoppingCart += "\n";
				}
				
				System.out.println(shoppingCart);
				return shoppingCart;
				
			case 3:
				System.out.println("Purchase Item");
				
				
				
				
				
		
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	
	
	
	input.close();
	return "";
	
}


	

	
	
	
}


