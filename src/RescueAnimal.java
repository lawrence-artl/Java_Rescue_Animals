
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.lang.String;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private int age;
    private double weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


    // Constructor
    public RescueAnimal() {
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	// These are redundant, leaving in for future updates if they start to use idk hamsters or something
	public String getAnimalType() {
		return animalType;
	}


	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}


	public String getGender() {
		return gender;
	}

	// Overloading mutators to allow for direct setting of values during compiling
    // while allowing for user input to set values during runtime
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// adding 'animal' input variable to customize each method for the specific animal being input
	// allows for each method to be reused regardless of what type of animal is being used
	
	public String setGender(Scanner scanner, String animal) throws IOException {
		boolean genderMenu = true;
		String gender = null;
		do {
			try {
				System.out.println("What is the " + animal + "'s gender? ");
				System.out.println("Please type 'm' or 'f': ");
				
	            char g = scanner.next().charAt(0);
	            //check that input is appropriate
	            g = Character.toLowerCase(g);
	            if (g == 'm') {
	            	gender = "male";
	            	genderMenu = false;
	            }
	            else if (g == 'f') {
	            	gender = "female";
	            	genderMenu = false;
	            }
	            else {
	            	System.out.println("That is not a valid selection, please use 'm' or 'f' for gender.");
	            }
	            
	            
			}
			catch (InputMismatchException ex) {
				System.out.println("That is not a valid selection, please use 'm' or 'f' for gender.");
				scanner.nextLine();
				
			}
			
		} while (genderMenu);
		
		//System.out.println(gender);
		return gender;
		
		//this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public int setAge(Scanner scanner, String animal) throws IOException {
		boolean inMenu = true;
		int age = 0;
		do {
			try {
				System.out.println("What is the " + animal + "'s age? Please enter an integer: ");
				age = scanner.nextInt();
				inMenu = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("That is not a valid selection, please enter an integer for the age.");
				scanner.nextLine();		//clear the scanner
			}
		}	while(inMenu);
		
		return age;
		
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double setWeight(Scanner scanner, String animal) throws IOException {
		boolean inMenu = true;
		double weight = 0;
		do {
			try {
				System.out.println("What is the " + animal + "'s weight? Please enter a number: ");
				weight = scanner.nextDouble();
				inMenu = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("That is not a valid selection, please enter a number for the weight.");
			}
		}	while(inMenu);
		
		return weight;
		
	}


	public String getAcquisitionDate() {
		return acquisitionDate;
	}


	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}
	
	public String setAcquisitionDate(Scanner scanner) throws IOException{
		String date = null;
		boolean monthMenu = true;
		boolean dayMenu = true;
		boolean yearMenu = true;
		int month = 0;
		int day = 0;
		int year = 0;
		
		do {
			try {
				System.out.println("Please enter a number for the month of aquisition (1 - 12): ");
				month = scanner.nextInt();
				if(month < 0 || month > 12) {
					System.out.println("That is not a valid entry for 'Month'; please enter a number from 1 to 12: ");
				}
				else {
					monthMenu = false;
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("That is not a valid entry; please enter an integer as specified.");
			}
		}	while(monthMenu);
		
		do {
			try {
				System.out.println("Please enter a number for the day of aquisition (1 - 31): ");
				day = scanner.nextInt();
				if(day < 0 || day > 31) {
					System.out.println("That is not a valid entry for 'Day'; please enter a number from 1 to 31: ");
				}
				else {
					dayMenu = false;
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("That is not a valid entry; please enter an integer as specified.");
			}
		}	while(dayMenu);
		
		do {
			try {
				System.out.println("Please enter a year for the date of aquisition (ex: 1972): ");
				year = scanner.nextInt();
				if(year < 1900 || year > 2100) {
					System.out.println("That is not a valid entry for 'Year'; please enter a number from 1900 to 2021: ");
				}
				else {
					yearMenu = false;
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("That is not a valid entry; please enter an integer as specified.");
			}
		}	while(yearMenu);
		
		date = Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
				
		return date;
	}


	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}


	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}
	
	public String setAcquisitionLocation(Scanner scanner, String animal) {
		String loc = null;
		scanner.nextLine();
		System.out.println("Enter the location the " + animal + " was acquired: ");
		loc = scanner.nextLine();
		return loc;
	}


	public boolean getReserved() {
		return reserved;
	}


	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	
	public boolean setReserved(Scanner scanner, String animal) {
		boolean inMenu = true;
		boolean reserved = false;
		char s = 'n';
		do {
			System.out.println("Has the " + animal + " been reserved? (y/n) ");
			s = scanner.next().charAt(0);
			s = Character.toLowerCase(s);
			if(s == 'y') {
				reserved = true;
				inMenu = false;
			}
			else if(s == 'n') {
				reserved = false;
				inMenu = false;
			}
			else {
				System.out.println("That is not a valid selection; please enter 'y' or 'n': ");
			}
		}	while(inMenu);
		
		return reserved;
	}


	public String getInServiceLocation() {
		return inServiceCountry;
	}


	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}
	
	public String setInServiceCountry(Scanner scanner, String animal) {
		String country = null;
		scanner.nextLine();
		System.out.println("Enter the location the " + animal + " in service: ");
		country = scanner.nextLine();
		
		return country;
	}




	public String getTrainingStatus() {
		return trainingStatus;
	}


	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
	public String setTrainingStatus(Scanner scanner, String animal) {
		String training = null;
		System.out.println("Enter the training status of the " + animal + ": ");
		training = scanner.nextLine();
		return training;
	}
}
