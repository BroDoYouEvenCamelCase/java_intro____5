package udemy;

public class Workbook_3_2 {
    public static void main(String[] args) {
        double wallet = 100; double toyCar = 5.99; double nike = 95.99;

        System.out.println("Can you buy me this car ");
        if( wallet >= toyCar) {
            wallet -= toyCar;
            System.out.println(" Sure and Wallet is " + wallet);
        }else {
            System.out.println("Sorry i only have " + wallet +" left");
        }
        System.out.println("Can you buy me these shoes");
        if(wallet >= nike) {
            System.out.println("Sure");
        }else {
            System.out.println("I only have " + wallet + "left");
        }


}}
