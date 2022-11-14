package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project06_Task2 {

    public static void main(String[] args) {
        int[] array = { 2,-5,6,7,-10,-78,0,15 };
        System.out.println(Arrays.toString(removeNegatives(array)));
    }

    public static int[] removeNegatives(int[] num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : num) {
            if (n >= 0) {
                list.add(n);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).intValue();
        }
        return result;
    }
}
