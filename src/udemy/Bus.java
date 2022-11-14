package udemy;

public class Bus {
    public static void main(String[] args) {
        // updates variables

        String sentence = "Number of passengers: :";
        System.out.println(sentence);

        int passengers = 0;
        passengers = passengers + 9;
        System.out.println(sentence + passengers);

        passengers = passengers - 5;
        System.out.println(sentence + passengers);

        passengers = passengers - 4;
        System.out.println(sentence + passengers);

        passengers += 9;
        System.out.println(passengers);

        passengers -= 5;
        System.out.println(passengers);

        passengers -=4;
        System.out.println(passengers);

        //+= operator updates a value by adding the value on the right

        sentence = "end of shift";
        System.out.println(sentence);

    }
}
