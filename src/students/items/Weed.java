package students.items;

public class Weed extends Item {
	
	/*
	 *  Constructor for Weed class - since maturation and death age are infinite,
	 *  making them max values is logical and they are directly created through super
	 */
	public Weed() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}
	
	public Weed(Weed original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}
	
	// This is always represented as: #
	public String toString() {
		return "#";
	}


}
