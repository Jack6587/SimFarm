package students;

import java.util.Scanner;
import students.items.*;

public class Farm {
	
	private int startingFunds;
	private Field field;

	public Farm(int fieldWidth, int fieldHeight, int startingFunds) {
		this.startingFunds = startingFunds;
		this.field = new Field(fieldWidth, fieldHeight);
	}
	
	public void run() {
		// Initialise new input
		Scanner s = new Scanner(System.in);
		// Boolean to continue or end the loop
		boolean run = true;
		
		while(run) {
			// This while loop has exception handling to avoid program crashing. First, it tries this loop
			try {
				// String representation of the field and input options for each loop
				System.out.println(field.toString());
				System.out.println("Bank balance: $" + startingFunds + "\n");
				System.out.println("Enter your next action:");
				System.out.println("t x y: till");
				System.out.println("h x y: harvest");
				System.out.println("p x y: plant");
				System.out.println("b x y: buy scarecrow");
				System.out.println("s: field summary");
				System.out.println("w: wait");
				System.out.println("q: quit \n");
			
				String input = s.nextLine();
				/*
				 * Initialised a String array of characters, split by " ". This allows us to
				 * extract and parse integers for farm operations
				 */
				String[] characters = input.split(" ");
			
				// Quits the game by changing run to false
				if(input.equals("q")){
					run = false;
				}
				
				// User chooses to wait. This progresses the age forward once based on the tick() function
				else if(input.equals("w")) {
					field.tick();
				}
				
				// User chooses to get a summary. This outputs the summary String representation based on the getSummary() function
				else if(input.equals("s")) {
					System.out.println(field.getSummary());
				}
				
				/*
				 * User chooses to till at a certain position. 
				 * It takes the integers inputted, subtracts by 1 (so that they match the actual data positions)
				 * and uses the till(int,int) function.
				 */
				else if(characters[0].equals("t")) {
					int x = Integer.parseInt(characters[1]) - 1;
					int y = Integer.parseInt(characters[2]) - 1;
					field.till(x, y);
					field.tick();
				}
				
				/*
				 * User chooses to harvest at a specified position. It gets the value of the item,
				 * adds it to the "startingFunds" value and replaces it with a Soil object. This action progresses time
				 */
				else if(characters[0].equals("h")) {
					int x = Integer.parseInt(characters[1]) - 1;
					int y = Integer.parseInt(characters[2]) - 1;
					
					Item harvestItem = field.get(x, y);
					startingFunds += harvestItem.getValue();
					field.plant(x, y, new Soil());
					System.out.println("Item sold!");
					field.tick();
				}
				
				/*
				 *  Important to note: here I chose not to progress the age when planting as I felt
				 *  it wouldn't make sense to age every time something plants. This is my own take on the function;
				 *  I understand that the assignment specifies that after each action, the field ages, so this could be wrong
				 */
				else if(characters[0].equals("p")) {
					int x = Integer.parseInt(characters[1]) - 1;
					int y = Integer.parseInt(characters[2]) - 1;
					
					/*
					 * This if statement checks to make sure no item exists at the current position.
					 * Otherwise, it continues with normal procedures
					 */
					Item currentItem = field.get(x, y);
					if(currentItem != null && currentItem instanceof Apples || currentItem instanceof Grain) {
						System.out.println("An item already exists at this position.");
					} else {
						// String representation + takes input
						System.out.println("Enter: \n" + "'a' to buy an apple for $2 \n" + "'g' to buy grain for $1\n");
						
						String plant = s.nextLine();
						
						/*
						 * In the scenario that User picks Apple we:
						 * Check if the funds are available. If they are, extract the cost of the Apple item.
						 * Then, create a new instance of Apple, and use the plant() function to place it at position x, y
						 */
						if(plant.equals("a")) {
							if(startingFunds >= 2) {
								startingFunds -= 2;
								Item plantApple = new Apples();
								field.plant(x, y, plantApple);
							} else {
								System.out.println("Not enough funds to buy an apple.");
							}
						// Same process occurs for Grain: we check for necessary funds, and a plant a new Grain item
						} else if(plant.equals("g")) {
							if(startingFunds >= 1) {
								startingFunds -= 1;
								Item plantGrain = new Grain();
								field.plant(x, y, plantGrain);
							} else {
								System.out.println("Not enough funds to buy grain.");
							}
						// Validate input	
						} else {
							System.out.println("Invalid input item type.");
						}
					}
					
				} else if(characters[0].equals("b")) {
					int x = Integer.parseInt(characters[1]) - 1;
					int y = Integer.parseInt(characters[2]) - 1;
					
					// Creates a new Scarecrow instance to place on the field and get rid of crows
					if(startingFunds > 4) {
						startingFunds -= 4;
						Item scarecrow = new Scarecrow();
						scarecrow.placeScarecrow(field, x, y);
					}
				}
				else {
					throw new IllegalArgumentException("Invalid command");
				}
			}
			// Here, it catches when coordinate values are entered at the wrong position (for example: p  5 4 instead of p 5 4)
			catch(NumberFormatException e) {
				System.out.println("Invalid coordinates. Please enter valid integers at the correct positions. \n");
			}
			catch(IllegalArgumentException e) {
				System.out.println("Invalid input: " + e.getMessage() + "\n");
			}
			// This is for all other exceptions
			catch(Exception e) {
				System.out.println("Error: " + e.getMessage() + "\n");
			}
			
			
		}
		// Closes the input scanner
		s.close();

		}
		
	}

