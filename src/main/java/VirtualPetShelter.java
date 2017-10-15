import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> petValues() {
		return pets.values();
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public void restPets() {
		for (VirtualPet current : pets.values()) {
			current.sleep();
		}
	}

	public void feedPets() {
		for (VirtualPet current : pets.values()) {
			current.feed();
		}
	}

	public void waterPets() {
		for (VirtualPet current : pets.values()) {
			current.drink();
		}
	}

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}

	public void removeByName(String name) {
		pets.remove(name);
	}

	public void shelterTick() {
		for (VirtualPet current : pets.values()) {
			current.tick();
		}
	}
}
