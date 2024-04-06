package students.items;

public class UntilledSoil extends Item {
	
	public UntilledSoil() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}
	
	public UntilledSoil(UntilledSoil original) {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE, -1);
	}

	// This is always represented as: /
	public String toString() {
		return "/";
	}


}