package students.items;

public class Apples extends Food {
	
	private static final int maturationAge = 3;
	private static final int deathAge = 5;
	private static final int monetaryValue = 3;
	private static int generationCount = 0;
	
	public Apples() {
		super(maturationAge, deathAge, monetaryValue);
		generationCount++;
	}
	
	// Copy constructor for the get() method in Field
	public Apples(Apples original) {
		super(Apples.maturationAge, Apples.deathAge, Apples.monetaryValue);
	}
	
	@Override
	// Returns a string representation "a" or "A" based on maturationAge
	public String toString() {
		if(age < maturationAge) {
			return "a";
		} else {
			return "A";
		}
	}
		
		
	public static int getGenerationCount() {
		return generationCount;
	}

}
