package students.items;

public class Apples extends Food {
	
	/*
	 *  Constant variables for Apples
	 */
	private static final int MATURATION_AGE = 3;
	private static final int DEATH_AGE = 5;
	private static final int MONETARY_VALUE = 3;
	private static int generationCount = 0;
	
	/*
	 *  Constructor
	 */
	public Apples() {
		super(MATURATION_AGE, DEATH_AGE, MONETARY_VALUE);
		generationCount++;
	}
	
	/*
	 *  Copy constructor for the get() method in Field
	 */
	public Apples(Apples original) {
		super(Apples.MATURATION_AGE, Apples.DEATH_AGE, Apples.MONETARY_VALUE);
	}
	
	@Override
	/*
	 *  Returns a string representation "a" or "A" based on maturationAge
	 */
	public String toString() {
		if(age < MATURATION_AGE) {
			return "a";
		} else {
			return "A";
		}
	}
		
		
	public static int getGenerationCount() {
		return generationCount;
	}

}
