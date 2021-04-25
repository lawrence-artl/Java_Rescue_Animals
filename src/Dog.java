//import java.util.InputMismatchException;
import java.util.Scanner;
//import java.io.IOException;
import java.lang.String;


public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, int age,
    double weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setAnimalType("Dog");

    }
    
    public Dog() {
    	
    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }
    
    public String setBreed(Scanner scanner) {
    	String breed = null;
    	scanner.nextLine();
    	
    	System.out.println("Enter the breed of the dog: ");
		breed = scanner.nextLine();
    	
    	return breed;
    }

}
