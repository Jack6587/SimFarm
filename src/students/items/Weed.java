package students.items;

public class Weed extends Item {
	
	// Constructor for Weed class - since maturation and death age are infinite, making them max values is logical and they are directly created through super
	public Weed() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}
	
	// String representation: /
	public String toString() {
		return "#";
	}


}
