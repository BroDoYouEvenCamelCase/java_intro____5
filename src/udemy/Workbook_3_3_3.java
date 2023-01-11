package udemy;

public class Workbook_3_3_3 {
    public static void main(String[] args) {
        int gryffindor = 200;
        int ravenclaw = 400;

        int margin = gryffindor - ravenclaw;

        if(margin >= 300) System.out.println("Gryffindor takes the house cup ");

        else if(margin >= 0) System.out.println("In second place, Gryffindor! ");

        else if(margin < 100) System.out.println("In third place, Gryffindor! ");

        else System.out.println("In fourth place, Gryffindor! ");
    }
}
