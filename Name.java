public class Name {
    // Private instance variables to hold the last and first names
    private String last;
    private String first;

    // Parameterized constructor to initialize the instance variables with given values
    Name(String last, String first) {
        this.last = last;   // 'this' refers to the instance variable
        this.first = first;
    }

    // No-argument constructor that initializes the instance variables to default values
    Name() {
        this("<unknown>", "<unknown>"); // Calls the parameterized constructor
    }

    // Setter method for the last name
    public void setLast(String last) {
        this.last = last;
    }

    // Setter method for the first name
    public void setFirst(String first) {
        this.first = first;
    }

    // Method to return a string representation of the object
    public String toString() {
        return last + ", " + first;
    }
}