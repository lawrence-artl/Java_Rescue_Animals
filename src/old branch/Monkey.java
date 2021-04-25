
public class Monkey extends RescueAnimal {

    // Instance variable
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;
    
    

    // Constructor
    public Monkey(String name, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, 
	String height, String bodyLength, String species) {
        
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
        

    }

    // Accessor Methods
    public String getSpecies() {
        return species;
    }
    public String getTailLength() {
    	return tailLength;
    }
    public String getHeight() {
    	return height;
    }
    public String bodyLength() {
    	return bodyLength;
    }

    // Mutator Methods
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }
    public void setTailLength(String tailLength) {
    	this.tailLength = tailLength;
    }
    public void setHeight(String height) {
    	this.height = height;
    }
    public void setBodyLength(String bodyLength) {
    	this.bodyLength = bodyLength;
    }

}
