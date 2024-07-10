public class Employee {
    // Private instance variables to hold the employee ID, name, address, and hire date
    private int id;
    private Name name;
    private Address address;
    private Date date;

    // Constructor that initializes the employee ID
    Employee(int id) {
        this.id = id; // 'this' refers to the instance variable
    }

    // Method to set the name using last and first name strings
    public void setName(String last, String first) {
        name = new Name(last, first); // Creates a new Name object and assigns it to the name variable
    }

    // Method to set the address using street address, city, state, and zip code
    public void setAddress(String streetAddr, String city, String state, int zip) {
        address = new Address(streetAddr, city, state, zip); // Creates a new Address object and assigns it to the address variable
    }

    // Method to set the hire date using month, day, and year
    public void setDate(int month, int day, int year) {
        date = new Date(month, day, year); // Creates a new Date object and assigns it to the date variable
    }

    // Method to return a string representation of the Employee object
    public String toString() {
        return ("Employee Information: " +
                "\nID: " + id +
                "\nName: " + name + 
                "\nAddress: " + address +
                "\nHire date: " + date);
    }

    // Getter method for the employee ID
    public int getId() {
        return id;
    }

    // Getter method for the employee name
    public String getName() {
        return name.toString();
    }

    // Getter method for the employee address
    public String getAddress() {
        return address.toString();
    }

    // Getter method for the hire date
    public String getDate() {
        return date.toString();
    }
}

