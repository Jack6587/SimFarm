package students.items;

public class Item {
	public int age, maturationAge, deathAge, monetaryValue;
	
	public Item(int maturationAge, int deathAge, int monetaryValue) {
		this.age = 0;
		this.maturationAge = maturationAge;
		this.deathAge = deathAge;
		this.monetaryValue = monetaryValue;
	}
	
	public void tick() {
		age ++;
	}
	
	public void setAge(int ageValue) {
		this.age = ageValue;
		
	public boolean died() {
		return age > deathAge;
	}
	
}
