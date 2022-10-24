package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String [] [] students = {
                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdallah", "Newer"}

        };
        System.out.println(students[0][1]); // Mehmet
        System.out.println(students[1][1]); // Regina

        System.out.println(students.length);

        System.out.println((Arrays.toString(students[0]))); // [Ali,Mehmet,Alex]
        System.out.println((Arrays.toString(students[1]))); // [Alex, Regina]
        System.out.println((Arrays.toString(students[2]))); // [Abdallah, Newer]

        for (int i = 0; i < students.length ; i++) {
            System.out.println(Arrays.toString(students[i]));


            //Printing inner arrays with for each loop

            for (String [] group : students) {
                System.out.println(Arrays.toString(group));
            }
            //Printing the multi-dimensional array
            System.out.println(Arrays.deepToString(students)); // [[Ali, Mehmet, Alex], [Alex, Regina], [Abdallah, Newer]]


            /*
            Task
            Print each member in different lines
            Ali
            Mehmet
            Alex
            Alex
            Regina
            Abdallah
            Newer
             */}
        //Priting each students with for each loop
        for(String [] group : students) {
            for(String student : group){
                System.out.println(student);
            }
        }
        // Printing each student with for i loop
        for (int i = 0; i < students.length ; i++) {
            for (int j = 0; j <students[i].length; j++) {
                System.out.println(students[i][j]);

            }

        }
    }
}
