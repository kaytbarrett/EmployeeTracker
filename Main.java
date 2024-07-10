/**
 * Katherine (Katie) Barrett
 * EN.605.201.81.SU24
 * Assignment #6
 * 
 * References used for this assignment: 
 * Module 6 Office Hours Presentation
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declare and initialize a variable to hold the employee count;
        int employeeCount = 0;

        // Declare an array to hold a list of employee information
        Employee[] employeeList;

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in); 

        System.out.println("How many employees do you want to enter data for?");
        employeeCount = input.nextInt(); // Read the number of employees
        input.nextLine(); // Consume the newline character

         // Initialize the array with number of employees the user wants to enter data for
        employeeList = new Employee[employeeCount];

        // For each employee, create a new Employee object with ID and update thier name, address, and hire date
        for (int i = 0; i < employeeCount; i++) {
            employeeList[i] = new Employee(i + 1); // Create a new Employee object with ID

            updateName(employeeList[i], input);
            updateAddress(employeeList[i], input);
            updateHireDate(employeeList[i], input);
        }

        System.out.println();
        System.out.println("Summary:");
        System.out.println();

        printAllEmployees(employeeList); // Print the details of all employees

        input.close(); // Close the Scanner object
    }

    private static void updateName(Employee employee, Scanner input) {
        // Declare variables to hold first and last names
        String first;
        String last;

        System.out.println("\nEmployee " + employee.getId() + " Name Information");
        System.out.println("--------------------------------");

        System.out.println("Enter employee's first name:");
        first = input.nextLine(); // Read the employee's first name

        System.out.println("Enter employee's last name:");
        last = input.nextLine(); // Read the employee's last name

        employee.setName(last, first); // Set the employee's name
    }

    private static void updateAddress(Employee employee, Scanner input) {
        // Declare variables to hold street, city, state, and zip
        String streetAddr;
        String city;
        String state;
        int zip;

        System.out.println("\nEmployee " + employee.getId() + " Address Information");
        System.out.println("--------------------------------");

        System.out.println("Enter employee's street address (ex: 123 Main St):");
        streetAddr = input.nextLine(); // Read the street address

        System.out.println("Enter employee's city:");
        city = input.nextLine(); // Read the city

        System.out.println("Enter employee's state:");
        state = input.nextLine(); // Read the state

        System.out.println("Enter employee's zip:");
        zip = input.nextInt(); // Read the zip code
        input.nextLine(); // Consume the newline character

        employee.setAddress(streetAddr, city, state, zip); // Set the employee's address
    }

    private static void updateHireDate(Employee employee, Scanner input) {
        // Declare variables to hold the value for month, day, and year
        int month;
        int day;
        int year;

        System.out.println("\nEmployee " + employee.getId() + " Hire Date Information");
        System.out.println("--------------------------------");

        System.out.println("Enter employee's hire month (1 - 12):");
        month = input.nextInt(); // Read the hire month
        input.nextLine(); // Consume the newline character

        System.out.println("Enter employee's hire day (1 - 31):");
        day = input.nextInt(); // Read the hire day
        input.nextLine(); // Consume the newline character

        System.out.println("Enter employee's hire year (1900 - 2024):");
        year = input.nextInt(); // Read the hire year
        input.nextLine(); // Consume the newline character

        employee.setDate(month, day, year); // Set the employee's hire date
    }

    private static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString()); // Print the employee's information
            System.out.println("--------------------------------");
        }
    }
}

