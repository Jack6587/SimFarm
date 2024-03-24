package students.items;

public class Grain extends Food {
	private static final int maturationAge = 2;
	private static final int deathAge = 6;
	private static final int monetaryValue = 2;
	private static int generationCount = 0;
	
	public Grain() {
		super(maturationAge, deathAge, monetaryValue);
		generationCount++;
	}
	
	public String toString() {
		if(Grain.age < maturationAge) {
			return "g";
		} else {
			return "G";
		}
	}
	
	public static int getGenerationCount() {
		return generationCount;
	}
	
}
