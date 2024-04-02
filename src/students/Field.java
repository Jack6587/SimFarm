package students;

import students.items.*;

public class Field {
	
	/* Instance variables - 2D array "field" of type Item
	 * Height and width used for representing the rows and columns respectively
	 */
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
	
	// Functionality to increase the age by 1 for all items
	public void tick() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				Item currentItem = field[i][j];
				field[i][j].tick();
				
				/* Here, a new instance of Weed can be created when the "currentItem" 
				 * is Soil and it meets the 20% criteria. Math.random() (on a spectrum of 0.0-1.0) is used 
				*/
				if(currentItem instanceof Soil && Math.random() <= 0.2) {
					field[i][j] = new Weed();
				}
				if(field[i][j].died()) {
					field[i][j] = new UntilledSoil();
				}
			}
		}
	}
	
	public String toString() {
		 //Creates a StringBuilder to create a more efficient/faster/better representation of the string.
		StringBuilder fieldOutput = new StringBuilder();
		
		// Creates first space (in top left corner of field)
		fieldOutput.append(" ");
		// For loop that iterates over width and appends current number to the string
		for(int j = 0; j < width; j++) {
			fieldOutput.append(j + " ");
		}
		// Creates a line break to start with field grid
		fieldOutput.append("\n");
		
		/*
		 * Nested for loop. First, handles the number of the row.
		 * Then, it adds the current field item (initially all soil objects)
		 * to the grid. Note that all string additions have a " " for readability
		 * and adherence to specifications
		 */
		for(int i = 1; i <= height; i++) {
			fieldOutput.append(i + " ");
			for(int j = 0; j < width; j++) {
				fieldOutput.append(field[i][j] + " ");
			}
			fieldOutput.append("\n");
		}
		
		// Returns the field output
		return fieldOutput.toString();
	}
	
	/* 
	 * Takes the current location in the field (as seen by height and width)
	 * and "tills" it with a new Soil object
	 */
	public void till(int height, int width) {
		field[height][width] = new Soil();
	}
	
	// Returns a copy of the item at specified field position
	public Item get(int height, int width) {
		Item originalItem = field[height][width];
		Grain originalGrain = (Grain) originalItem;
        return new Grain(originalGrain);

	}
	
	// Stores item (as passed in parameter) to the Field position
	public void plant(int height, int width, Item item) {
		field[height][width] = item;
	}
	
	/*
	 *  Returns the value of all items in the field as a total.
	 *  It uses a nested for loop to iterate over the 2D array,
	 *  and calls on the getValue() method specified in the Item class,
	 *  adding that value to a new variable called totalValue
	 */
	public int getValue() {
		int totalValue = 0;
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				totalValue += field[i][j].getValue();
			}
		}
		
		return totalValue;
		
	}
	
	/*
	 * This method returns a string summary of the values of the field. It is aligned and appended through a StringBuilder
	 * to create a readable approach (both in code and output) to the summary method.
	 */
	public String getSummary() {
		StringBuilder fieldSummary = new StringBuilder();
		
		// These variables are used to count the number of each Item
		int totalApples = 0;
		int totalGrain = 0;
		int totalSoil = 0;
		int totalUntilled = 0;
		int totalWeed = 0;
		int totalValue = 0;
		
		// For loop iterates over 2D array of Items in Field
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				Item currItem = field[i][j];
				
				// Counts each item time and adds it to respective counter
				if(currItem instanceof Apples) {
					totalApples++;
				} else if(currItem instanceof Grain) {
					totalGrain++;
				} else if(currItem instanceof Soil) {
					totalSoil++;
				} else if(currItem instanceof UntilledSoil) {
					totalUntilled++;
				} else if(currItem instanceof Weed) {
					totalWeed++;
				}
			}
			
		}
		
		// Gets the total value to be used in the string
		totalValue = getValue();

		fieldSummary.append("Apples:        ").append(totalApples).append("\n");
		fieldSummary.append("Grain:         ").append(totalGrain).append("\n");
		fieldSummary.append("Soil:          ").append(totalSoil).append("\n");
		fieldSummary.append("Untilled:      ").append(totalUntilled).append("\n");
		fieldSummary.append("Weed:          ").append(totalWeed).append("\n");
		fieldSummary.append("For a total of ").append(totalValue).append("\n");
		fieldSummary.append("Total apples created: ").append(Apples.getGenerationCount()).append("\n");
		fieldSummary.append("Total grain created:  ").append(Grain.getGenerationCount()).append("\n");
		
		// Uses the StringBuilder's toString() method to return a regular string representation, as expected by the method
		return fieldSummary.toString();
	}
	
}