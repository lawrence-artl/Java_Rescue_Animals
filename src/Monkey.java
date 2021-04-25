import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Monkey extends RescueAnimal {

    // Instance variable
	// Changed these to doubles bc they are numbers, seemed to make more sense that way
	// plus adds mathematic manipulation functionality in the future 
    private String species;
    private double tailLength;
    private double height;
    private double bodyLength;
    
    

    // Constructor
    public Monkey(String name, String gender, int age,
    double weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, double tailLength, 
	double height, double bodyLength, String species) {
        
    	//call mutators to set values
    	setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
        setAnimalType("Monkey");
        

    }
    public Monkey() {
    	
    }

    // Accessor Methods
    public String getSpecies() {
        return species;
    }
    public double getTailLength() {
    	return tailLength;
    }
    public double getHeight() {
    	return height;
    }
    public double bodyLength() {
    	return bodyLength;
    }

    // Mutator Methods
    // Set Species of monkey
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }
    
    public String setSpecies(Scanner scanner) throws IOException {
    	String species = null;
    	scanner.nextLine();
    	boolean inMenu = true;
    	int selection = 0;
    	do {
    		try {
        		System.out.println("Enter the species of the monkey: ");
        		//I only know three species of monkey off the top of my head; this can be expanded in the future tho
            	System.out.println("[1] Capuchin\n[2] Chimpanzee\n[3] Spider\n[4] Not specified");
            	
        		selection = scanner.nextInt();
        		if(selection > 0 && selection < 5) {
        			inMenu = false;
        		}
        		else {
        			System.out.println("That is not a valid selection; please use the menu to select a species.");
        		}
        		
        		}
        	catch (InputMismatchException ex) {
        		System.out.println("That is not a valid selection; please use the menu to select a species.");
        		scanner.nextLine();
        		}
    	}	while(inMenu);
    	
    	
		
		switch (selection) {
		case 1:{
			species = "Capuchin";
			break;
			}
		case 2:{
			species = "Chimpanzee";
			break;
			}
		case 3:{
			species = "Spider";
			break;
			}
		case 4:{
			species = "N/A";
			break;
			}
		default:{
			species = "Monkey";
			break;
			}
		}
    	
    	return species;
    }
    
    // Overloading mutators to allow for direct setting of values during compiling
    // while allowing for user input to set values during runtime
    
    // Set tail length
    public void setTailLength(double tailLength) {
    	this.tailLength = tailLength;
    }
    public double setTailLength(Scanner scanner) throws IOException {
		boolean inMenu = true;
		double tail = 0.0;
		do {
			try {
				System.out.println("What is the monkey's tail length in inches? Please enter a number: ");
				tail = scanner.nextDouble();
				inMenu = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("That is not a valid selection, please enter a number for the tail length.");
			}
		}	while(inMenu);
		
		return tail;
		
	}
    
    // Set height of monkey
    public void setHeight(double height) {
    	this.height = height;
    }
    public double setHeight(Scanner scanner) throws IOException {
		boolean inMenu = true;
		double height = 0.0;
		do {
			try {
				System.out.println("What is the monkey's height in inches? Please enter a number: ");
				height = scanner.nextDouble();
				inMenu = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("That is not a valid selection, please enter a number for the height.");
			}
		}	while(inMenu);
		
		return height;
		
	}
    
    // Set body length of monkey
    public void setBodyLength(double bodyLength) {
    	this.bodyLength = bodyLength;
    }
    
    public double setBodyLength(Scanner scanner) throws IOException {
		boolean inMenu = true;
		double body = 0.0;
		do {
			try {
				System.out.println("What is the monkey's body length in inches? Please enter a number: ");
				body = scanner.nextDouble();
				inMenu = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("That is not a valid selection, please enter a number for the body length.");
			}
		}	while(inMenu);
		
		return body;
		
	}

}
