package students;

import students.items.Item;
import students.items.Soil;
import students.items.Weed;

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
				Item currentItem = field[i][j];
				field[i][j].tick();
				
				if(currentItem instanceof Soil && Math.random() <= 0.2) {
					field[i][j] = new Weed();
				}
			}
		}
	}
	
	public String toString() {
		StringBuilder fieldOutput = new StringBuilder();
		
		fieldOutput.append(" ");
		for(int j = 0; j < width; j++) {
			fieldOutput.append(j + " ");
		}
		fieldOutput.append("\n");
		
		for(int i = 1; i <= height; i++) {
			fieldOutput.append(i + " ");
			for(int j = 0; j < width; j++) {
				fieldOutput.append(field[i][j] + " ");
			}
			fieldOutput.append("\n");
		}
		
		return fieldOutput.toString();
	}
	
}