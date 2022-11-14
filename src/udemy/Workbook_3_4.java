package udemy;

public class Workbook_3_4 {
    public static void main(String[] args) {
        int temp = -12;
        String forecast = "";
        System.out.println(forecast);

        if(temp <= -1) {
            forecast = "Freezing";
        }else if (temp <= 10) {
            forecast = "Chilly";
        }else {
            forecast = "Its Warm";
        }
        System.out.println(forecast);
    }}