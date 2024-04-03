package students.items;

public class Soil extends Item {
	
	public Soil() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
	}
	
	// Copy constructor for the get() method in Field
	public Soil(Soil original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
	}

	// String representation: .
	public String toString() {
		return ".";
	}


}