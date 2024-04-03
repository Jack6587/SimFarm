package students;

import java.util.Scanner;
import students.items.*;

public class Farm {
	
	private final int startingFunds;
	private Field field;

	public Farm(int fieldWidth, int fieldHeight, int startingFunds) {
		this.startingFunds = startingFunds;
		this.field = new Field(fieldWidth, fieldHeight);
	}
	
	public void run() {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
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
			
			if(input.equals("q")){
				run = false;
			}
			
			if(input.equals("w")) {
				field.tick();
			}
			
			if(input.equals("s")) {
				System.out.println(field.getSummary());
			}
			
			if(characters[0].equals("t")) {
				int x = Integer.parseInt(characters[1]);
				int y = Integer.parseInt(characters[2]);
				
				field.till(x, y);
				
			}
			
			if(characters[0].equals("h")) {
				int x = Integer.parseInt(characters[1]);
				int y = Integer.parseInt(characters[2]);
				
				Item harvestItem = field.get(x, y);
			}
			
			if(characters[0].equals("p")) {
				int x = Integer.parseInt(characters[1]);
				int y = Integer.parseInt(characters[2]);
				
				System.out.println("Enter: \n" + "'a' to buy an apple for $3 \n" + "'g' to buy grain for $2\n");
				
				String plant = s.nextLine();
				
				if(plant.equals("a")) {
					if(startingFunds > Apples.monetaryValue) {
						field.plant(x, y, new Apples());
					} else {
						System.out.println("Sorry, not enough funds to buy an apple.");
					}
				} else if(plant.equals("g")) {
					if(startingFunds > Grain.monetaryValue) {
						field.plant(x, y, new Grain());
					} else {
						System.out.println("Sorry, not enough funds to buy grain.");
					}
				}
				
			}
			
			field.tick();
		}
		
		s.close();
	}
	
}
