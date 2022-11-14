package udemy;

public class Workbook_3_3 {
    public static void main(String[] args) {

     int gryffindor = 100; int ravenclaw = 500;

     int margin = gryffindor - ravenclaw;

     if(margin >= 300) {
         System.out.println("Gryffindor takes the house cup");
     }else if (margin >= 0) {
         System.out.println("In second place, Gryffindor");
     } else if (margin <100) {
         System.out.println("third place");
     }else {
         System.out.println("fourth place");}


    }
}
