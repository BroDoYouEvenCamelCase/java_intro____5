package udemy;

public class Workbook_4_3 {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55;
        printTemps(noon);
        printTemps(evening);
        printTemps(midnight);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void printTemps(double fahrenheit) {
        System.out.println("F = " + fahrenheit);
        System.out.println("C = " + fahrenheitToCelsius(fahrenheit));

    }


}