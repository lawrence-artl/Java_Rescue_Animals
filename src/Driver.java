import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    // Instance variables (if needed)

    public static void main(String[] args) throws IOException {

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
        	else if(selection == '4') {
        		printAnimals(scnr, 4);	//using the same method for all three selections, sending int to discern what user wants
        	}
        	else if(selection == '5') {
        		printAnimals(scnr, 5);
        	}
        	else if(selection == '6') {
        		printAnimals(scnr, 6);
        	}
        	else {
        		//default in case input isn't appropriate
        		System.out.println("That is not a valid selection; please try again.");
        	}
        	
        	
        }while (inMenu);
        

        
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
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", 1, 25.6, "05/12/2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", 3, 35.2, "02/03/2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", 4, 25.6, "12/12/2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	//add a monkey to test the list
    	Monkey monkey1 = new Monkey("Marcel", "male", 4, 35.0, "03/27/2021", "South Africa", "intake", true, "United States", 25.5, 32.5, 58, "Capuchin");
    	Monkey monkey2 = new Monkey("Billy Bob", "male", 4, 35.0, "03/27/2021", "South Africa", "in service", false, "United States", 25.5, 32.5, 58, "Capuchin");
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	

    }
    
    
    public static void intakeNewDog(Scanner scanner) throws IOException {
    	Dog newDog = new Dog();
    	System.out.println("What is the dog's name?");
    	scanner.nextLine();
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
            else {
            	newDog.setName(name);
            	boolean dogMenu = true;
            	do {
            		// send to RescueAnimal class with scanner and animal type string
            		// allow user to set variables
            		newDog.setAnimalType("dog");
            		newDog.setGender(newDog.setGender(scanner, "dog"));
            		newDog.setAge(newDog.setAge(scanner, "dog"));
            		newDog.setBreed(newDog.setBreed(scanner));
            		newDog.setWeight(newDog.setWeight(scanner, "dog"));
            		newDog.setAcquisitionDate(newDog.setAcquisitionDate(scanner));
            		newDog.setAcquisitionLocation(newDog.setAcquisitionLocation(scanner, "dog"));
            		newDog.setTrainingStatus(newDog.setTrainingStatus(scanner, "dog"));
            		newDog.setReserved(newDog.setReserved(scanner, "dog"));
            		newDog.setInServiceCountry(newDog.setInServiceCountry(scanner, "dog"));
            		newDog.setAnimalType("Dog");
            		
            		dogList.add(newDog);
            		
            		dogMenu = false;
            		
            		
            	} while (dogMenu);
            	return;
            }
        }

    }


        public static void intakeNewMonkey(Scanner scanner) throws IOException {
        	Monkey newMonkey = new Monkey();
        	System.out.println("What is the monkey's name? ");
            scanner.nextLine();
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(name)) {
            		
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return;
            	}
            	else {
                	newMonkey.setName(name);
                	boolean monkeyMenu = true;
                	do {
                		// send to RescueAnimal class with scanner and animal type string
                		// allow user to set variables
                		newMonkey.setAnimalType("Monkey");
                		newMonkey.setGender(newMonkey.setGender(scanner, "monkey"));
                		newMonkey.setAge(newMonkey.setAge(scanner, "monkey"));
                		newMonkey.setSpecies(newMonkey.setSpecies(scanner));
                		newMonkey.setWeight(newMonkey.setWeight(scanner, "monkey"));
                		newMonkey.setHeight(newMonkey.setHeight(scanner));
                		newMonkey.setBodyLength(newMonkey.setBodyLength(scanner));
                		newMonkey.setTailLength(newMonkey.setTailLength(scanner));
                		newMonkey.setAcquisitionDate(newMonkey.setAcquisitionDate(scanner));
                		newMonkey.setAcquisitionLocation(newMonkey.setAcquisitionLocation(scanner, "monkey"));
                		newMonkey.setTrainingStatus(newMonkey.setTrainingStatus(scanner, "monkey"));
                		newMonkey.setReserved(newMonkey.setReserved(scanner, "monkey"));
                		newMonkey.setInServiceCountry(newMonkey.setInServiceCountry(scanner, "monkey"));
                		newMonkey.setAnimalType("Monkey");
                		
                		monkeyList.add(newMonkey);
                		
                		monkeyMenu = false;
                		
                		
                	} while (monkeyMenu);
                	return;
                }
            	
            }
            
            
        }
        
        public static void reserveAnimal(Scanner scanner) throws IOException {
            boolean inMenu = true;
        	int selection = 0;
        	int dogIndex = 0;
        	int monkeyIndex = 0;
        	Dog resDog = new Dog();
        	Monkey resMonkey = new Monkey();
        	boolean availableAnimal = false;
        	
        	String country;
        	System.out.println("To reserve an animal, choose a type and a country.");
            
            do {
            	try {
                	// prompt user to select a type of animal; can be modified for future expansion
            		System.out.println("Select a type of animal:\n[1] Dog\n[2] Monkey");
                	selection = scanner.nextInt();
                	if(selection < 1 || selection > 2) {
                		System.out.println("That is not a valid selection; please enter '1' or '2'.");
                	}
                	
                	else {
                		
                		inMenu = false;
                	}
            	}
            	catch(InputMismatchException ex) {
                	System.out.println("That is not a valid input, please enter a number.");
                	scanner.nextLine();
                }
                	
            }	while(inMenu);
            
            scanner.nextLine();
        	System.out.println("Enter the country of service for the animal: ");
        	country = scanner.nextLine();
        	if (selection == 1) {
        		for(Dog dog: dogList) {
        			System.out.println(dog.getInServiceLocation());
        			if(dog.getInServiceLocation().equals(country) && dog.getReserved() == false) {
        				resDog = dog;
        				System.out.print(dog.getName() + " is available. ");
        				dogIndex = dogList.indexOf(dog);
        				availableAnimal = true;	//this variable tells the program to print an error to the user if the
        										//animal doesn't exist per the criteria
        				break;
        			}
        			else {
        				availableAnimal = false;
        				
        			}
        		}
        		if(availableAnimal == false) {
        			System.out.println("There are no dogs available that fit that criteria.");	//error
        			return;
        		}
        		else {
        			System.out.println(resDog.getName() + " will be reserved for you.");
        			dogList.get(dogIndex).setReserved(true);	//reserve the dog in the array list
        		}
        		
        		
        	}
        	
        	//this code is exact same as above save for the monkey variables;
        	//copy and paste below for expansion of more animals 
        	//like a rescue whale or something
        	else if (selection == 2) {
        		for(Monkey monkey: monkeyList) {
        			if(monkey.getInServiceLocation().equals(country) && monkey.getReserved() == false) {
        				resMonkey = monkey;
        				System.out.print(monkey.getName() + " is available. ");
        				monkeyIndex = monkeyList.indexOf(monkey);
        				availableAnimal = true;
        				break;
        			}
        			else {
        				availableAnimal = false;
        			}
        		}
        		if(availableAnimal == false) {
        			System.out.println("There are no monkeys available that fit that criteria.");
        			return;
        		}
        		else {
        			System.out.println(resMonkey.getName() + " will be reserved for you.");
        			monkeyList.get(monkeyIndex).setReserved(true);
        			
        		}
        	}
        	                        
        }

        
        public static void printAnimals(Scanner scanner, int animalSelection) throws IOException {
        	
        	//using temporary array lists is TIGHT
        	//actually just convenient, as not all animals will be available and I don't want to sort through the list over and over
        	ArrayList<RescueAnimal> tempRescueList= new ArrayList<RescueAnimal>();
        	
        	
        	
        	if(animalSelection == 4) {
            	for(Dog dog: dogList) {
                	//System.out.println("Dog: " + dog.getName() + "\tStatus: " + dog.getTrainingStatus() + "\tReserved: " + dog.getReserved() + "\tCountry: " + dog.getAcquisitionLocation());
                	System.out.printf("%-5s %-10s %-7s %-10s %-9s %-10s %n", "Name:", dog.getName(), "Status:", dog.getTrainingStatus(), "Reserved:", dog.getReserved());
            	}
            }
            else if(animalSelection == 5) {
            	for(Monkey monkey: monkeyList) {
            		//System.out.println("Monkey: " + monkey.getName() + "\tStatus: " + monkey.getTrainingStatus() + "\tReserved: " + monkey.getReserved() + "\tCountry: " + monkey.getAcquisitionLocation());
            		System.out.printf("%-5s %-10s %-7s %-10s %-9s %-10s %n", "Name:", monkey.getName(), "Status:", monkey.getTrainingStatus(), "Reserved:", monkey.getReserved());
            	}
            }
            else if(animalSelection == 6) {
            	for(Monkey monkey: monkeyList) {
            		if(monkey.getReserved() == false && monkey.getTrainingStatus().equals("in service")) {
            			tempRescueList.add(monkey);
            		}
            	}
            	for(Dog dog: dogList) {
            		if(dog.getReserved() == false && dog.getTrainingStatus().equals("in service")) {
            			tempRescueList.add(dog);
            		}
            	}
            }
        	
        	if(tempRescueList.isEmpty()) {
        		System.out.println("There are no rescue animals to display.");
        		
        	}
        	else {
        		System.out.println("All rescue animals that can be reserved:");
        		for(RescueAnimal animal: tempRescueList) {
        			//System.out.println("Name: " + animal.getName() + "\tType: " + animal.getAnimalType() + "\t Reserved: " + animal.getReserved() + "\t Country: " + animal.getAcquisitionLocation());
        			System.out.printf("%-5s %-10s %-5s %-10s %n", "Name:", animal.getName(), "Type:", animal.getAnimalType());
        		
        		}
        		
        	}
        }
}

