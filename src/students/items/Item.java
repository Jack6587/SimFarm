package students.items;

/**
 * Item representation that can be placed in field
 */
public abstract class Item {
	public int age;
	private int maturationAge;
	private int deathAge;
	private int monetaryValue;
	
	/**
	 * Constructor for Item - age is set separately
	 * @param maturationAge Age of maturity for selling an item
	 * @param deathAge Age of death for an item
	 * @param monetaryValue Value of item for selling
	 */
	public Item(int maturationAge, int deathAge, int monetaryValue) {
		this.age = 0;
		this.maturationAge = maturationAge;
		this.deathAge = deathAge;
		this.monetaryValue = monetaryValue;
	}
	
	/**
	 *  Increments the age by 1
	 */
	public void tick() {
		age++;
	}
	
	/**
	 * Sets the age of the instance of Item to the parameter ageValue
	 * @param ageValue The new age of the item
	 */
	public void setAge(int ageValue) {
		this.age = ageValue;
	}
	
	/**
	 * Returns string representation for whether an item has died or not
	 * @return True if item has died, false otherwise
	 */
	public boolean died() {
		return age > deathAge;
	}
	
	/* Returns an integer, either value or 0, based on whether Item has reached maturation age or not.
	 * Must be an instance of Food class
	 */
	public int getValue() {
		if(age >= maturationAge && this instanceof Food) {
			return(monetaryValue);
		} else {
			return 0;
		}
	}
	
	/**
	 * Returns true or false based on a number of conditions. 
	 * It checks if it is equal to the object parameter, if it is an instance of item,
	 * and compares the values to return true or false
	 * 
	 * @param obj Object of comparison
	 * @return True if equal, false if not
	 */
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if(!(obj instanceof Item)) {
			return false;
		}
		
		Item other = (Item) obj;
		
		return age == other.age &&
				maturationAge == other.maturationAge &&
				deathAge == other.deathAge &&
				monetaryValue == other.monetaryValue;
				
	}

	/**
	 * Abstract method to be used in all subclasses for String representation
	 */
	public abstract String toString();
	
}
