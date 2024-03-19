package students.items;

public class Item {
	public int age, maturationAge, deathAge, monetaryValue;
	
	public void tick() {
		age += 1;
	}
	
	public void setAge(int ageValue) {
		this.age = ageValue;
		
	public boolean died() {
		return age > deathAge;
	}
	
	}
	
}
