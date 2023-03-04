/**
 * 
 */
package storeParts;

/**
 * @author Joshua Bridges
 *
 */
public class Armor extends Salable
{
	//Unique Armor Variables
	String armorType;
	int strength;
	
	// Parametized Constructor
public Armor(String type, String name, String description, double price, int quanity, String armortype, int strength)
{
		super(armortype, name, description, price, strength);
		
	
		// TODO Auto-generated constructor stub
		
}
//Default Constructor
public Armor() 
{
	
}

// toString Method for instances of Armor
@Override
public String toString() {
	return "Armor [armortype=" + armortype + ", name=" + name + ", durability=" + durability + ", price=" + price
			+ ", description=" + description + "]";
}
/**
 * @return the armortype
 */
public String getArmortype() {
	return armortype;
}
/**
 * @param armortype the armortype to set
 */
public void setArmortype(String armortype) {
	this.armortype = armortype;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the durability
 */
public int getDurability() {
	return durability;
}
/**
 * @param durability the durability to set
 */
public void setDurability(int durability) {
	this.durability = durability;
}
/**
 * @return the price
 */
public double getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
private String armortype;
private String name;
private int durability;
private double price;
private String description;
/**
 * @return the armortype
 */



}

