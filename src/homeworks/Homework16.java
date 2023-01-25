package homeworks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework16 {

    public static void main(String[] args) {
        System.out.println("TASK 1-----------------------------");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("TASK 2------------------------------");
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("Apple", 3);
        map1.put("Mango", 1);
        System.out.println(calculateTotalPrice1(map1));
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Apple", 2);
        map2.put("Pineapple", 1);
        map2.put("Orange", 3);
        System.out.println(calculateTotalPrice1(map2));

        System.out.println("TASK 3--------------------------------");
        LinkedHashMap<String, Integer> map3 = new LinkedHashMap<>();
        map3.put("Apple", 3);
        map3.put("Mango", 5);
        System.out.println(calculateTotalPrice2(map3));
        LinkedHashMap<String, Integer> map4 = new LinkedHashMap<>();
        map4.put("Apple", 4);
        map4.put("Mango", 8);
        map4.put("Orange", 3);
        System.out.println(calculateTotalPrice2(map4));



    }

    public static TreeMap<Integer, String> parseData(String str){
        TreeMap<Integer, String> map = new TreeMap<>();
        String[] arr = str.substring(1).split("[{]");
        String[][] newArr = new String[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i].split("}");
        }

        for (int i = 0; i < newArr.length; i++) {
            map.put(Integer.parseInt(newArr[i][0]), newArr[i][1]);
        }

        return map;
    }

    public static double calculateTotalPrice1(LinkedHashMap<String, Integer> map){
        double sum = 0;

        LinkedHashMap<String, Double> priceMap = new LinkedHashMap<>();
        priceMap.put("Apple", 2.00);
        priceMap.put("Orange", 3.29);
        priceMap.put("Mango", 4.99);
        priceMap.put("Pineapple", 5.25);


        for (Map.Entry<String, Integer> s : map.entrySet()) {
            for (Map.Entry<String, Double> p: priceMap.entrySet()) {
                if(s.getKey().equals(p.getKey())) sum += s.getValue() * p.getValue();
            }
        }
        return sum;
    }

    public static double calculateTotalPrice2(LinkedHashMap<String, Integer> map){
        double sum = 0;
        LinkedHashMap<String, Double> priceMap = new LinkedHashMap<>();
        priceMap.put("Apple", 2.00);
        priceMap.put("Orange", 3.29);
        priceMap.put("Mango", 4.99);

        for (Map.Entry<String, Integer> s : map.entrySet()) {
            for (Map.Entry<String, Double> p: priceMap.entrySet()) {
                if(s.getKey().equals(p.getKey())) {
                    if (s.getKey().equals("Mango")) {
                        int freeMango = s.getValue() / 3;
                        sum += s.getValue() * p.getValue() - freeMango * p.getValue();
                    } else if (s.getKey().equals("Apple")) {
                        int discountApple = s.getValue() / 2;
                        sum += s.getValue() * p.getValue() - discountApple * (0.5 * p.getValue());
                    } else
                        sum += s.getValue() * p.getValue();
                }
            }
        }
        return sum;
    }
}
