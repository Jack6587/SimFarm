package students.items;

import students.*;
/**
 * Represents a scarecrow, which can be placed in a field and is used to scare crows away
 */
public class Scarecrow extends Item {
	
	/**
	 * Scarecrow uses the same constructor values as Weed, Soil and UntilledSoil as those details
	 * don't matter to the Item. It is a subclass of Item because it can use methods relevant to it
	 * to act in the Field
	 */
	public Scarecrow() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
	}
	
	/**
	 *  Copy constructor for the get() method in Field class
	 *  @param original Original scarecrow item for copying
	 */
	public Scarecrow(Scarecrow original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}
	
	/**
	 * Places scarecrow at given coordinates
	 * @param field Field to put the scarecrow in
	 * @param x The x-axis coordinate in the field
	 * @param y The y-axis coordinate in the field
	 */
	public void placeScarecrow(Field field, int x, int y) {
		field.plant(x, y, this);
	}
	
	/**
	 * Replaces the scarecrow with Untilled Soil and an output message
	 * @param field Field to remove scarecrow from
	 * @param x The x-axis coordinate in the field
	 * @param y The y-axis coordinate in the field
	 */
	public void removeScarecrow(Field field, int x, int y) {
		field.plant(x, y, new UntilledSoil());
		System.out.println("The scarecrow has been removed.");
	}
	
	@Override
	/**
	 *  Returns a string representation of scarecrow
	 *  @return String representation of scarecrow
	 */
	public String toString() {
		return "S";
	}
	
}
