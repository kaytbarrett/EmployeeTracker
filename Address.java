public class Address {
    // Private instance variables to hold the street address, city, state, and zip code
    private String streetAddr;
    private String city;
    private String state;
    private int zip;

    // Parameterized constructor to initialize the instance variables with given values
    Address(String streetAddr, String city, String state, int zip) {
        this.streetAddr = streetAddr; // 'this' refers to the instance variable
        this.city = city;            
        this.state = state;           
        this.zip = zip;               
    }

    // No-argument constructor that initializes the instance variables to default values
    Address() {
        this("<unknown>", "<unknown>", "<unknown>", 00000); // Calls the parameterized constructor
    }

    // Setter method for the street address
    public void setStreetAddr(String streetAddr) {
        this.streetAddr = streetAddr;
    }

    // Setter method for the city
    public void setCity(String city) {
        this.city = city; 
    }

    // Setter method for the state
    public void setState(String state) {
        this.state = state;
    }

    // Setter method for the zip code
    public void setZip(int zip) {
        this.zip = zip;
    }

    // Method to return a string representation of the Address object
    public String toString() {
        return streetAddr + ", " + city + ", " + state + ", " + zip; 
    }
}

