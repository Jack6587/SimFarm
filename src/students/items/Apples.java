package students.items;

/**
 * Represents a Food Item of type Apple
 */
public class Apples extends Food {
	
	/*
	 *  Constant variables for Apples
	 */
	private static final int MATURATION_AGE = 3;
	private static final int DEATH_AGE = 5;
	private static final int MONETARY_VALUE = 3;
	private static int generationCount = 0;
	
	/**
	 *  Apple constructor
	 */
	public Apples() {
		super(MATURATION_AGE, DEATH_AGE, MONETARY_VALUE);
		generationCount++;
	}
	
	/**
	 *  Copy constructor for the get() method in Field
	 *  @param original Original apple item to copy
	 */
	public Apples(Apples original) {
		super(Apples.MATURATION_AGE, Apples.DEATH_AGE, Apples.MONETARY_VALUE);
	}
	
	@Override
	/**
	 *  Returns a string representation "a" or "A" based on maturationAge
	 *  @return String representation of apple item
	 */
	public String toString() {
		if(age < MATURATION_AGE) {
			return "a";
		} else {
			return "A";
		}
	}
		
	/**
	 * Gets total number of apple objects across the entire game
	 * @return Generation count of apple objects
	 */
	public static int getGenerationCount() {
		return generationCount;
	}

}
