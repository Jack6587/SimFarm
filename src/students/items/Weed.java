package students.items;

/**
 * Represents Weed, a sublcass of Item, that belongs in a Field
 */
public class Weed extends Item {
	
	/**
	 *  Constructor for Weed class - since maturation and death age are infinite,
	 *  making them max values is logical and they are directly created through super
	 */
	public Weed() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}
	
	/**
	 * Constructor for copy of weed
	 * @param original Original instance of Weed
	 */
	public Weed(Weed original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}

	@Override
	/**
	 *  This is always represented as: #
	 *  @return String representation of Weed
	 */
	public String toString() {
		return "#";
	}
	



}
