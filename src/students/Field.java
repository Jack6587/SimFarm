package students;

import students.items.Item;
import students.items.Soil;

public class Field {
	
	// Instance variable - 2D array "field" of type Item
	private int height;
	private int width;
	private Item[][] field;
	
	public Field(int height, int width) {
		// Creates a new field instance
		this.height = height;
		this.width = width;
		field = new Item[height][width];
	
		// Initialised a nested for loop to iterate over height and width of the field to add an instance of Soil to each
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < height; j++) {
				field[i][j] = new Soil();
			}
		}
	}
	
	public void tick() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				field[i][j].tick();
			}
		}
	}
	
	public String toString() {
		StringBuilder fieldOutput = new StringBuilder();
		
		fieldOutput.append(" ");
		for(int j = 0; j < width; j++) {
			fieldOutput.append(j + " ");
		}
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				fieldOutput.append(field[i][j] + " ");
			}
		}
		
		return fieldOutput.toString();
	}
	
}