package udemy;

public class Workbook_4_2_2 {
    public static void main(String[] args) {

        double bill = 53.50;
        tipTheWaiter(bill);
    }

    public static void tipTheWaiter( double bill){

        double tip = bill * .15;
        System.out.println("your servie was wonderful! Please acceput this tip $ " + tip);
    }

}