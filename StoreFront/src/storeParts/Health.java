package storeParts;

public class Health extends Salable 
{
	// Unique object variables
	private int healthGain;
	
	
	
	/**
	 * @param string
	 * @param potionSize
	 */
	// Parametized Constructor
	
	public Health(String type, String name, String desc, double price, int quanity, int healthGain) 
	{
		// TODO Auto-generated constructor stub
		super();
		this.healthGain = healthGain;
		
	}

	
	// Default Constructor
	public Health()
	{
		
	}

	// Health Getter and Setter
	public int getHealthGain() {
		return healthGain;
	}
	public void setHealthGain(int healthGain) {
		this.healthGain = healthGain;
	}
	

	// toString Method for instances of Weapon
		public String toString() {
			return "ItemType = " + getType() + " Name = " + getName() + "Desc = " + getDescription() + 
					 "HealthGain = " + getHealthGain() + "Price = " + getPrice() + "Qty = " + getQuanity() ;
		}
	
	
	
	
	
	
}
