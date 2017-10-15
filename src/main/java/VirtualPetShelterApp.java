import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String optionSelect;
		String name;
		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();
		VirtualPet larry = new VirtualPet("Larry", "Stooge");
		VirtualPet moe = new VirtualPet("Moe", "Stooge");
		VirtualPet curly = new VirtualPet("Curly", "Stooge");
		VirtualPet shemp = new VirtualPet("Shemp", "Stooge");
		myVirtualPetShelter.addPet(larry);
		myVirtualPetShelter.addPet(moe);
		myVirtualPetShelter.addPet(curly);
		myVirtualPetShelter.addPet(shemp);

		System.out.println("Welcome to the Virtual Pet Shelter!");
		do {
			myVirtualPetShelter.shelterTick();
			System.out.println("Here are our available pets.");
			System.out.println(myVirtualPetShelter.petValues());
			System.out.println("What would you like to do?");
			System.out.println("Enter [1] to feed all the pets.");
			System.out.println("Enter [2] to water all the pets.");
			System.out.println("Enter [3] to rest all the pets.");
			System.out.println("Enter [4] to play with a particular pet.");
			System.out.println("Enter [5] to adopt a pet.");
			System.out.println("Enter [6] to leave a pet");
			System.out.println("Enter [7] to leave the store");
			optionSelect = input.nextLine();
			if (optionSelect.equals("1")) {
				myVirtualPetShelter.feedPets();
				System.out.println("You have fed the pets!");
			} else if (optionSelect.equals("2")) {
				myVirtualPetShelter.waterPets();
				System.out.println("You have watered the pets!");
			} else if (optionSelect.equals("3")) {
				myVirtualPetShelter.restPets();
				System.out.println("You have put the pets to sleep (don't worry they'll wake up, unlike your dog"
						+ " Rex, but he was old and unhappy and he's in a better place now. Right Dear?");
			} else if (optionSelect.equals("4")) {
				System.out.println("Please tell me the name of the pet you would like to play with.");
				System.out.println(myVirtualPetShelter.petValues());
				name = input.nextLine();
				myVirtualPetShelter.getPet(name).play();
				System.out.println(name + " says 'thanks' for playing!");
			} else if (optionSelect.equals("5")) {
				System.out.println("Please tell me the name of the pet you would like to adopt.");
				System.out.println(myVirtualPetShelter.petValues());
				name = input.nextLine();
				myVirtualPetShelter.removeByName(name);
				System.out.println("Enjoy your new pet " + name + "!");
			} else if (optionSelect.equals("6")) {
				System.out.println("What is the name of the pet you would like to leave?");
				String petName = input.nextLine();
				System.out.println("Can you describe your pet?");
				String description = input.nextLine();
				myVirtualPetShelter.addPet(new VirtualPet(petName, description));
				System.out.println("Thanks for bringing " + petName + " to us!");
			} else {
				if (!optionSelect.equals("7"))
					System.out.println("Please try again.");
			}

		} while ((!optionSelect.equals("7")) && (!myVirtualPetShelter.petValues().isEmpty()));

		System.out.println("Thanks for visiting the pet store!");
		System.out.println("Have a nice day!");

		input.close();
	}

}
