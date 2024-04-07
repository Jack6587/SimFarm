package students.items;

import students.*;

public class Scarecrow extends Item {
	
	/*
	 * Scarecrow uses the same constructor values as Weed, Soil and UntilledSoil as those details
	 * don't matter to the Item. It is a subclass of Item because it can use methods relevant to it
	 * to act in the Field
	 */
	public Scarecrow() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
	}
	
	// Copy constructor for the get() method in Field class
	public Scarecrow(Scarecrow original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}
	
	// Places scarecrow at given coordinates
	public void placeScarecrow(Field field, int x, int y) {
		field.plant(x, y, this);
	}
	
	// Replaces the scarecrow with Untilled Soil and an output message
	public void removeScarecrow(Field field, int x, int y) {
		field.plant(x, y, new UntilledSoil());
		System.out.println("The scarecrow has been removed.");
	}
	
	@Override
	// String representation of scarecrow
	public String toString() {
		return "S";
	}
	
}
