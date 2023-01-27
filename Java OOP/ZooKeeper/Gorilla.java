public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("Gorilla throwing something");
		energyLevel -= 5;
		displayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("Gorilla eating Bananas");
		energyLevel += 10;
		displayEnergy();
	}
	
	public void climb() {
		System.out.println("Gorilla climbing a tree");
		energyLevel -= 10;
		displayEnergy();
	}
}
