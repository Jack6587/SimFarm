package students;

import java.util.Scanner;

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
			System.out.println("Bank balance: $" + startingFunds);
			System.out.println("Enter your next action:");
			System.out.println("t x y: till");
			System.out.println("h x y: harvest");
			System.out.println("p x y: plant");
			System.out.println("s: field summary");
			System.out.println("w: wait");
			System.out.println("q: quit");
			
			String input = s.nextLine();
			
			if(input.equals("q")){
				run = false;
			}
			if(input.equals("w")) {
				field.tick();
			}
			if(input.equals("s")) {
				field.getSummary();
			}
		}
		
		s.close();
	}
	
}
