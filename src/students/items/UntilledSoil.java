package students.items;

public class UntilledSoil extends Item {
	
	public UntilledSoil() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}
	
	public UntilledSoil(UntilledSoil original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}

	// String representation: /
	public String toString() {
		return "/";
	}


}