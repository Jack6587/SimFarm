package students.items;

import students.*;

public class Scarecrow extends Item {
	
	public Scarecrow(String age) {
		super(age);
	}
	
	// String representation of scarecrow
	public void placeScarecrow(Field field, int x, int y) {
		field.plant(x, y, this);
	}
	
	public void removeScarecrow(Field field, int x, int y) {
		field.plant(x, y, new UntilledSoil());
	}
	
	@Override
	public String toString() {
		return "S";
	}
	
}
