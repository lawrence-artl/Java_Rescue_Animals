import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    // Instance variables (if needed)

    public static void main(String[] args) {

    	//initialize all lists
        initializeDogList();
        initializeMonkeyList();
        
        Scanner scnr = new Scanner(System.in);
        boolean inMenu = true;
        
        //menu loop, do at least once
        do {
        	displayMenu();
        	char selection = scnr.next().charAt(0);	//input character
        	
        	//could use switch statement here
        	if (selection == 'q') {
        		inMenu = false;
        	}
        	else if(selection == '1') {
        		intakeNewDog(scnr);
        	}
        	else if(selection == '2') {
        		intakeNewMonkey(scnr);
        	}
        	else if(selection == '3') {
        		reserveAnimal(scnr);
        	}
        	else if(selection == '4' || selection == '5' || selection == '6') {
        		printAnimals();
        	}
        	else {
        		//default in case input isn't appropriate
        		System.out.println("That is not a valid selection; please try again.");
        	}
        	
        	
        }while (inMenu);
        

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	//add a monkey to test the list
    	Monkey monkey1 = new Monkey("Marcel", "male", "4", "35.0", "03-27=2021", "South Africa", "intake", false, "United States", "25.5", "32.5", "58", "Capuchin");
    	
    	monkeyList.add(monkey1);
    	

    }
    
    


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name? ");
            scanner.nextLine();
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return;
            	}
            	
            }
            System.out.println("What is the monkey's gender? (m/f) ");
            String gender;
            char g = scanner.next().charAt(0);
            //check that input is appropriate
            g = Character.toLowerCase(g);
            if (g == 'm') {
            	gender = "male";
            }
            else if (g == 'f') {
            	gender = "female";
            }
            else {
            	//send back to menu after this message
            	System.out.println("That is not a valid gender selection");
            	return;
            }
            //print out prompt, take input from user for attributes
            scanner.nextLine();
            System.out.println("What is the monkey's age? ");
            String age = scanner.nextLine();
            System.out.println("What is the weight of the monkey? ");
            String weight = scanner.nextLine();
            System.out.println("What is the date of the Monkey's aquisition? ");
            String acquisitionDate = scanner.nextLine();
            System.out.println("What country was the monkey aquired in? ");
            String acquisitionCountry = scanner.nextLine();
            System.out.println("What is the status of the monkey's training? ");
            String acquisitionStatus = scanner.nextLine();
            System.out.println("Has the monkey been reserved? y/n ");
            
            //test for appropriate character input
            char r = scanner.next().charAt(0);
            r = Character.toLowerCase(r);
            boolean reserved;
            if (r == 'y') {
            	reserved = true;
            }
            else if (r == 'n') {
            	reserved = false;
            }
            else {
            	System.out.println("That is not a valide response. ");
            	return;
            }
            scanner.nextLine();
            System.out.println("What country is the monkey in service? ");
            String inServiceCountry = scanner.nextLine();
            System.out.println("What is the length of the monkey's tail? ");
            String tailLength = scanner.nextLine();
            System.out.println("What is the height of the monkey? ");
            String height = scanner.nextLine();
            System.out.println("What is the length of the monkey's body? ");
            String bodyLength = scanner.nextLine();
            System.out.println("What species is the monkey? ");
            String species = scanner.nextLine();
            
            //add monkey to the list by creating new monkey
            Monkey monkeyNew = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, acquisitionStatus, reserved, inServiceCountry, 
            		tailLength, height, bodyLength, species);
            
            monkeyList.add(monkeyNew);
            
        }
        //String name, String gender, String age,
        //String weight, String acquisitionDate, String acquisitionCountry,
    	//String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, 
    	//String height, String bodyLength, String species

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("The method reserveAnimal needs to be implemented");

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
            System.out.println("The method printAnimals needs to be implemented");

        }
}

