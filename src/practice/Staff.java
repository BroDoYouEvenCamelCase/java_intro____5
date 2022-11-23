package practice;

public class Staff {
    // contents of the class

    private String nameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;
    // a field ^^^^^^ a variable that is declared inside a class it can be anything from a string to an int
    // or object to primitives either one works
    // a field can be private, public or protected
    // if it is private it can only be accessed in the class itself
    // if it is public it can be accessed from any class or package

    // encapsulation allows a class to hide data from other classes
    // final field indicates for exp that the hourly rate cannot be changed

    public void printMessage() {
        System.out.println("Calculating Pay…"); }

    public Staff(String name) {
        nameOfStaff = name; System.out.println("\n" + nameOfStaff);
        System.out.println("---------------------------"); }

    public Staff(String firstName, String lastName) {
        
        String fullName = firstName + lastName;

    }
    }


