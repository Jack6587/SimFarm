package students.items;

public class Scarecrow extends Item {
	
	// Instance variables for Sscarecrow
	private static final int age = 0;
	private static final int deathAge = 6;
	private static final int monetaryCost = 4;
	private static int generationCount = 0;
	
	// Constructor
	public Scarecrow() {
		super(age, deathAge, monetaryCost);
		generationCount++;
	}
	
	// String representation of scarecrow
	public String toString() {
		return "S";
	}
	
	public void scare() {
		while(age < deathAge) {
			
		}
	}
	
}
