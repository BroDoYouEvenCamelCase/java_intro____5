package collections;

import java.util.HashMap;
import java.util.Map;

public class Practice07_ProductPrices {
    public static void main(String[] args) {
        /*
        iphone - > 1000
        MacbookPro -> 1300
        IMac -> 1500
        Airpods - 200
        iPad - 700


        Task 1 :
        FInd the msot expensive product and print it as below


         */


        Map<String, Integer> productPrices = new HashMap<>();

        productPrices.put("iphone", 1000);
        productPrices.put("MacbookPro", 1300);
        productPrices.put("IMac", 1500);
        productPrices.put("Airpods", 200);
        productPrices.put("iPad", 700);

        int maxPrice = Integer.MIN_VALUE;
        String mostExpensiveProduct = "";
        for (Map.Entry<String, Integer> entry : productPrices.entrySet()) {
            if (entry.getValue() > maxPrice) {
                maxPrice = entry.getValue();
                mostExpensiveProduct = entry.getKey();
            }
        }

        System.out.println("The most expensive product is: " + mostExpensiveProduct + "price of " + maxPrice);
    }
    }



