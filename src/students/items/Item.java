package students.items;

public abstract class Item {
	public int age;
	private int maturationAge;
	private int deathAge;
	private int monetaryValue;
	
	// Constructor - age is set separately but initially = 0
	public Item(int maturationAge, int deathAge, int monetaryValue) {
		this.age = 0;
		this.maturationAge = maturationAge;
		this.deathAge = deathAge;
		this.monetaryValue = monetaryValue;
	}
	
	// Copy constuctor for the Item class - used for the get method in Field class
	public Item(Item original) {
		this.age = original.age;
		this.maturationAge = original.maturationAge;
		this.deathAge = original.deathAge;
		this.monetaryValue = original.monetaryValue;
	}
	
	// Increments the age by 1
	public void tick() {
		age++;
	}
	
	// Sets the age of the instance of Item to the parameter ageValue
	public void setAge(int ageValue) {
		this.age = ageValue;
	}
	
	// Returns string representation for whether an item has died or not
	public String died() {
		if(age > deathAge) {
			return("This item has died...");
		} else {
			return("This item is alive!");
		}
	}
	
	// Returns an integer, either value or 0, based on whether Item has reached maturation age or not. Must be an instance of Food class
	public int getValue() {
		if(age > maturationAge && this instanceof Food) {
			return(monetaryValue);
		} else {
			return 0;
		}
	}
	
	// Returns true or false based on a number of conditions. It checks if it is equal to the object parameter, if it is an instance of item, and compares the values to return true or false
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
	
	public abstract String toString();
	
	
	
}
