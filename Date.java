public class Date {
    // Private instance variables to hold the month, day, and year
    private int month;
    private int day;
    private int year;

    // Parameterized constructor to initialize the instance variables with given values
    Date(int month, int day, int year) {
        this.month = month; // 'this' refers to the instance variable
        this.day = day;     
        this.year = year;   
    }

    // No-argument constructor that initializes the instance variables to default values
    Date() {
        month = 00; 
        day = 00;   
        year = 0000;
    }

    // Setter method for the month
    public void setMonth(int month) {
        this.month = month;
    }

    // Setter method for the day
    public void setDay(int day) {
        this.day = day;
    }

    // Setter method for the year
    public void setYear(int year) {
        this.year = year;
    }

    // Method to return a string representation of the Date object
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}

