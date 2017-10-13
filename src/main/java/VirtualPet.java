public class VirtualPet {

	public int hunger;
	public int thirst;
	public int tiredness;
	public String name;
	public String description;



	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 0;
		this.thirst = 0;
		this.tiredness = 0;
	}
	

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getTiredness() {
		return tiredness;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public VirtualPet(String name, String description, int hunger, int thirst, int tiredness) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.tiredness = tiredness;
	}

	public void feed() {
		hunger -= 5;
		tiredness += 5;
		thirst += 5;
	}

	public void sleep() {
		tiredness -= 5;
		hunger += 5;
		thirst += 5;
	}

	public void drink() {
		hunger += 5;
		tiredness += 5;
		thirst -= 5;
	}
	
	public void play() {
		hunger += 5;
		tiredness += 5;
		thirst +=5;
	}

	public void tick() {
		hunger += 3;
		tiredness += 3;
		thirst += 3;
	}
	
	@Override
	public String toString() {
		return "\nPet Name: \t " + name + "\nDescription: \t" + description + "\nHunger: \t" + hunger + "\nThirst: \t" + 
	thirst + "\nTiredness: \t" + tiredness+"\n";
	}

}