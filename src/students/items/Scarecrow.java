package students.items;

import students.*;

public class Scarecrow extends Item {
	
	public Scarecrow() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
	}
	
	public Scarecrow(Scarecrow original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}
	
	// String representation of scarecrow
	public void placeScarecrow(Field field, int x, int y) {
		field.plant(x, y, this);
	}
	
	public void removeScarecrow(Field field, int x, int y) {
		field.plant(x, y, new UntilledSoil());
		System.out.println("The scarecrow has been removed.");
	}
	
	@Override
	public String toString() {
		return "S";
	}
	
}
