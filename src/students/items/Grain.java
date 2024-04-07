package students.items;

/**
 * Represents Item (and more specifically Food) type Grain
 */
public class Grain extends Food {
	
	/*
	 *  Constant variables for Grain
	 */
	private static final int MATURATION_AGE = 2;
	private static final int DEATH_AGE = 6;
	private static final int MONETARY_VALUE = 2;
	private static int generationCount = 0;
	
	/**
	 *  Constructor for grain, increments generation count each time a grain object is instantiated
	 */
	public Grain() {
		super(MATURATION_AGE, DEATH_AGE, MONETARY_VALUE);
		generationCount++;
	}
	
	/**
	 *  Copy constructor for the get() method in Field
	 *  @param original Original grain item to copy
	 */
	public Grain(Grain original) {
		super(Grain.MATURATION_AGE, Grain.DEATH_AGE, Grain.MONETARY_VALUE);
	}
	
	@Override
	/**
	 *  Returns a lower or uppercase "G" depending on whether it is mature or not
	 *  @return String representation of Grain
	 */
	public String toString() {
		if(age < MATURATION_AGE) {
			return "g";
		} else {
			return "G";
		}
	}
	
	/**
	 *  Obtains the total number of instantiated grain objects
	 *  @return Generation count of Grain objects
	 */
	public static int getGenerationCount() {
		return generationCount;
	}
	
}
