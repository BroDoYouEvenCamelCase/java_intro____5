package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07_ReDo {
    public static void main(String[] args) {
        System.out.println("Task 8--------------------------");
        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));

        int beginsWithM = 0;
        int notContainAOrE = 0;

        for (String o: objects) {
            if (o.toLowerCase().startsWith("m")) beginsWithM++;
            if (!(o.toLowerCase().contains("a") || o.toLowerCase().contains("e")))
                notContainAOrE++;

        }
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        System.out.println(beginsWithM);
        System.out.println(notContainAOrE);

        System.out.println("Task 9--------------------------------------");




    }
}
