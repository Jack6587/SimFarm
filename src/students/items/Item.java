package students.items;

public class Item {
	private int age, maturationAge, deathAge, monetaryValue;
	
	// Constructor - age is set separately but initially = 0
	public Item(int maturationAge, int deathAge, int monetaryValue) {
		this.age = 0;
		this.maturationAge = maturationAge;
		this.deathAge = deathAge;
		this.monetaryValue = monetaryValue;
	}
	
	// Increments the age by 1
	public void tick() {
		age ++;
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
	
	
	
}
