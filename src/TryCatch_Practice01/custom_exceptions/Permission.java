package TryCatch_Practice01.custom_exceptions;

public class Permission {
    /*
    Create a method called as isAgeValid, that takes an int as an argument
    it returns true if the age is more than 16
    otherwise it throws an IllegalStateException with "Age of{age} is restricted!!!"
     */

    public static boolean isAgeValid(int age) {
        if (age > 16) {
            return true;
        } else {
            throw new IllegalStateException("Age of " + age + " is restricted!!!");
        }



        }

    }


