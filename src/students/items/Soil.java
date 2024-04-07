package students.items;

/**
 * Represents Soil, an Item that belongs in Field that can be planted on
 */
public class Soil extends Item {
	
	/**
	 * Soil constructor
	 */
	public Soil() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
	}
	
	/**
	 *  Copy constructor for the get() method in Field
	 *  @param original Original instance of Soil
	 */
	public Soil(Soil original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
	}

	@Override
	/**
	 *  This is always represented as: .
	 *  @return String representation of Soil
	 */
	public String toString() {
		return ".";
	}



}