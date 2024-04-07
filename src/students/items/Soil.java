package students.items;

public class Soil extends Item {
	
	public Soil() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
	}
	
	/*
	 *  Copy constructor for the get() method in Field
	 */
	public Soil(Soil original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
	}

	@Override
	/*
	 *  This is always represented as: .
	 */
	public String toString() {
		return ".";
	}



}