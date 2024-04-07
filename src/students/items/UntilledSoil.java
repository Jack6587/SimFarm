package students.items;

/**
 * Represents an alternate form of Soil, UntilledSoil, that cannot be planted on.
 * This is shown in the Farm class
 */
public class UntilledSoil extends Item {
	
	/**
	 * UntilledSoil constructor
	 */
	public UntilledSoil() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}
	
	/**
	 * UntilledSoil copy constructor
	 * @param original Original instance of UntilledSoil
	 */
	public UntilledSoil(UntilledSoil original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}

	@Override
	/**
	 *  This is always represented as: /
	 *  @return String representation of UntilledSoil
	 */
	public String toString() {
		return "/";
	}




}