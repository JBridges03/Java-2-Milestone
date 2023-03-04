/**
 * 
 */
package storeParts;

/**
 * @author Joshua Bridges
 *
 */
public class Weapon extends Salable
{
	// Unique Weapon Variables
	private String wpnType;
	private String ammoType;
	private String wpnSize;
	
	

	
	/**
	 * @param ammoType
	 * @param wpnSize
	 * @param wpnType 
	 */
	
	// Paremtized Constructor
	public Weapon( String type, String name, String description, double price, int quanity, String ammoType, String wpnSize, String wpnType) 
	{
	
		super();
		this.wpnType = wpnType;
		this.ammoType = ammoType;
		this.wpnSize = wpnSize;
	}
	//Default Constructor
	public Weapon()
	{
		
	}
	
	
	@Override
	// toString Method for instances of Weapon
	public String toString() {
		return "Weapon [wpnType=" + wpnType + ", ammoType=" + ammoType + ", wpnSize=" + wpnSize + "]";
	}
	public String getWpnType() {
		return wpnType;
	}
	public void setWpnType(String wpnType) {
		this.wpnType = wpnType;
	}
	public String getAmmoType() {
		return ammoType;
	}
	public void setAmmoType(String ammoType) {
		this.ammoType = ammoType;
	}
	public String getWpnSize() {
		return wpnSize;
	}
	public void setWpnSize(String wpnSize) {
		this.wpnSize = wpnSize;
	}
	

	
	
	
	
}
