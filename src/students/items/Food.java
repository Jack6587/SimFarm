package students.items;

/**
 * Represents Item type Food
 */
public abstract class Food extends Item {

	/**
	 * Food constructor
	 * @param maturationAge Age at which the food item matures and has value
	 * @param deathAge Age at which the food item dies
	 * @param monetaryValue Value of the food item
	 */
	public Food(int maturationAge, int deathAge, int monetaryValue) {
		super(maturationAge, deathAge, monetaryValue);
	}
}
