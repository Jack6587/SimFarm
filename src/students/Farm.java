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
		Scanner s = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			try {
				System.out.println(field.toString());
				System.out.println("Bank balance: $" + startingFunds + "\n");
				System.out.println("Enter your next action:");
				System.out.println("t x y: till");
				System.out.println("h x y: harvest");
				System.out.println("p x y: plant");
				System.out.println("s: field summary");
				System.out.println("w: wait");
				System.out.println("q: quit");
			
				String input = s.nextLine();
				String[] characters = input.split(" ");
				
				int x = Integer.parseInt(characters[1]) - 1;
				int y = Integer.parseInt(characters[2]) - 1;
			
				if(input.equals("q")){
					run = false;
				}
				
				else if(input.equals("w")) {
					field.tick();
				}
				
				else if(input.equals("s")) {
					System.out.println(field.getSummary());
				}
				
				else if(characters[0].equals("t")) {
					field.till(x, y);
					field.tick();
					
				}
				
				else if(characters[0].equals("h")) {				
					Item harvestItem = field.get(x, y);
					startingFunds += harvestItem.getValue();
					field.plant(x, y, new Soil());
					field.tick();
				}
				
				else if(characters[0].equals("p")) {
					Item currentItem = field.get(x, y);
					if(currentItem != null && currentItem instanceof Apples || currentItem instanceof Grain) {
						System.out.println("An item already exists at this position.");
					} else {
						System.out.println("Enter: \n" + "'a' to buy an apple for $3 \n" + "'g' to buy grain for $2\n");
						
						String plant = s.nextLine();
						
						if(plant.equals("a")) {
							if(startingFunds >= 3) {
								startingFunds -= 3;
								Item plantApple = new Apples();
								field.plant(x, y, plantApple);
							} else {
								System.out.println("Not enough funds to buy an apple.");
							}
							
						} else if(plant.equals("g")) {
							if(startingFunds >= 2) {
								startingFunds -= 2;
								Item plantGrain = new Grain();
								field.plant(x, y, plantGrain);
							} else {
								System.out.println("Not enough funds to buy grain.");
							}
						} else {
							System.out.println("Invalid input item type.");
						}
					}
					
				} else {
					throw new IllegalArgumentException("Invalid command");
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid coordinates. Please enter valid integers \n");
			}
			catch(IllegalArgumentException e) {
				System.out.println("Invalid input: " + e.getMessage() + "\n");
			}
			catch(Exception e) {
				System.out.println("Error: " + e.getMessage() + "\n");
			}
			
			
		}
		s.close();

		}
		
	}

