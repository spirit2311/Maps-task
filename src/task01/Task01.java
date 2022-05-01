package task01;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Bogdan Zabelin
 * @version 1.0.0
 */


public class Task01 {

    static Map<String, String> map;

    public static void main(String[] args) {
        getMap();
        showInfo();
        changeContacts();
        addContact();
        separation();
        showInfo();
    }

    private static void getMap() {
        map = new HashMap<>();
        map.put("Sara", "937-99-92");
        map.put("Edwin", "147-82-38");
        map.put("Fill", "524-24-32");
        map.put("John", "132-23-23");
        map.put("Eric", "752-11-45");
        map.put("Victor", "567-17-16");
        map.put("Alice", "365-49-54");
    }

    private static void changeContacts() {
        map.replace("Edwin", "147-82-38", "421-32-12");
    }

    private static void addContact() {
        map.putIfAbsent("Mark", "256-25-14");
    }

    private static void showInfo() {
        AtomicInteger count = new AtomicInteger(0);
        map.forEach((key, value) ->
                System.out.println(count.incrementAndGet() + ". " + key + " " + value));
    }

    private static void separation() {
        System.out.println("Updated list: ");
    }

}
