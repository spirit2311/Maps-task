package task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Bogdan Zabelin
 * @version 1.0.0
 */

public class Task02 {

    static Map<String, Integer> map;


    public static void main(String[] args) {
        getMap();
        showResult(doInput());

    }
    private static void getMap() {
        map = new HashMap<>();
        map.put("Apple", 15);
        map.put("Plum", 10);
        map.put("Cherry", 11);
        map.put("Orange", 95);
        map.put("Pineapple", 9);
        map.put("Pear", 45);
        map.put("Peach", 18);
        map.put("Raspberry", 25);
        map.put("Blueberry", 43);
        map.put("Coconut", 19);
    }

    private static String doInput(){
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        input = scanner.nextLine().trim();
        scanner.close();
        return input;
    }

    private static void showResult(String fruit){
        boolean hasContain =map.containsKey(fruit);
        if (hasContain){
            int quantity = map.get(fruit);
            System.out.println(fruit + ": "  + quantity);
        }
        else
            System.out.println("Fruit" + " not found");
    }
}
