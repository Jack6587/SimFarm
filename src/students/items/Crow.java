package students.items;

public class Crow {
	public int age;
	
	// Crow constructor
	public Crow(int age) {
		this.age = age;
	}
	
	// Designed to act as a method for getting rid of food
	public static void eatFood(Item item) {
		item = new UntilledSoil();
	}
	
}
