package students.items;

public class Grain extends Food {
	
	// Instance variables for Grain
	private static final int maturationAge = 2;
	private static final int deathAge = 6;
	private static final int monetaryValue = 2;
	private static int generationCount = 0;
	
	// Constructor for grain, increments generation count each time a grain object is instantiated
	public Grain() {
		super(maturationAge, deathAge, monetaryValue);
		generationCount++;
	}
	
	// Returns a lower or uppercase "G" depending on whether it is mature or not
	public String toString() {
		if(Grain.age < maturationAge) {
			return "g";
		} else {
			return "G";
		}
	}
	
	// Obtains the total number of instantiated grain objects
	public static int getGenerationCount() {
		return generationCount;
	}
	
}
