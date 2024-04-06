package students.items;

import students.Field;

public class Crow {
	
	// Crow constructor
	public Crow() {
		
	}
	
	// Designed to act as a method for getting rid of food (makes it Untilled Soil)
	public static void eatFood(Field field, int x, int y) {
		field[x][y] = new UntilledSoil();
	}
	
}
