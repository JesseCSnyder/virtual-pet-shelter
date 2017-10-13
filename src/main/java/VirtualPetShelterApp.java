import java.util.Scanner;
public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String optionSelect;
		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();
		VirtualPet larry = new VirtualPet("Larry", "Stooge");
		VirtualPet moe = new VirtualPet("Moe", "Stooge");
		VirtualPet curly = new VirtualPet("Curly", "Stooge");
		VirtualPet shemp = new VirtualPet("Shemp", "Stooge");
		myVirtualPetShelter.addPet(larry);
		myVirtualPetShelter.addPet(moe);
		myVirtualPetShelter.addPet(curly);
		myVirtualPetShelter.addPet(shemp);
		
		System.out.println("Welcome to the Virtual Pet Store!");
		do {
			myVirtualPetShelter.shelterTick();
			System.out.println("What would you like to do?");
			System.out.println("Enter [1] to feed all the pets.");
			System.out.println("Enter [2] to water all the pets.");
			System.out.println("Enter [3] to play with a particular pet.");
			System.out.println("Enter [4] to adopt a pet.");
			System.out.println("Enter [5] to leave a pet");
			System.out.println("Enter [5] to leave the store");
			optionSelect = input.nextLine();
			if (optionSelect.equals("1")) {
				myVirtualPetShelter.feedPets();
				}
			else if (optionSelect.equals("2")) {
				myVirtualPetShelter.waterPets();
				}
			else if (optionSelect.equals("3")) {
				
			}
			
				
				
				
				
				
				
				
			
		}while ((!optionSelect.equals("6")) && (!myVirtualPetShelter.petValues().isEmpty()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		myVirtualPetShelter.feedPets();
		myVirtualPetShelter.waterPets();
		myVirtualPetShelter.getPet("Curly").play();
		myVirtualPetShelter.removeByName("Curly");
		myVirtualPetShelter.shelterTick();
		
		
		System.out.println(myVirtualPetShelter.petValues());
		System.out.println(myVirtualPetShelter.getPet("Curly"));

		
input.close();
	}

}
