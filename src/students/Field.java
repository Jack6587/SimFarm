package students;

import students.items.Item;
import students.items.Soil;

public class Field {
	
	// Instance variable - 2D array "field" of type Item
	private Item[][] field;
	
	public Field(int height, int width) {
		// Creates a new field instance
		field = new Item[height][width];
	
		// Initialised a nested for loop to iterate over height and width of the field to add an instance of Soil to each
		for(int i = 0; i < field.length; i++) {
			for(int j = 0; j < field[j].length; i++) {
				field[i][j] = new Soil();
			}
		}
	}
	
}