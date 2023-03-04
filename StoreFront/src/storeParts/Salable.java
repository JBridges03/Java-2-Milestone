/**
 * 
 */
package storeParts;

/**
 * @author Joshua Bridges
 *
 */
public class Salable {

	private String type;
	private String name;
	private String description;
	private double price;
	private int quanity;
	
	
	



	/**
	 * @param type
	 * @param name
	 * @param description
	 * @param price
	 * @param quanity
	 */
	public Salable(String type, String name, String description, double price, int quanity) {
		super();
		this.type = type;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quanity = quanity;
	}





	public Salable() 
	
	{
		// TODO Auto-generated constructor stub
	}

	




	@Override
	public String toString() {
		return " type = " + type + ", name = " + name + ", description = " + description + ", price = $" + price
				+ ", quanity = " + quanity ;
	}





	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
