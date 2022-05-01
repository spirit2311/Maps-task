package task03;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Bogdan Zabelin
 * @version 1.0.0
 */

public class Task03 {

    static LinkedHashMap<String, String> clientMail;
    static String name;
    static String mail;

    public static void main(String[] args) {
        showData(getClientInitial());
        name = "Steven";
        mail = "StevenStrange@gmail.com";
        changeMail(name, mail);
        showData(getMailEdit(clientMail));
    }
    private static LinkedHashMap<String, String> getClientInitial(){
        clientMail = new LinkedHashMap<>();
        clientMail.put("Mark","Mark@gmail.com");
        clientMail.put("Sara","Sara@gmail.com");
        clientMail.put("Victor","Victor@gmail.com");
        clientMail.put("Antony","Antony@gmail.com");
        clientMail.put("Steven","Steven@gmail.com");
        clientMail.put("Sam","Sam@gmail.com");
        return clientMail;
    }
    private static void showData(LinkedHashMap<String, String> clientMail){
        AtomicInteger count = new AtomicInteger(0);
        System.out.println("\n");
        clientMail.forEach((key, value) ->
                System.out.println(count.incrementAndGet() + ". " + key + " - " + value));
    }
    private static void changeMail(String name, String mail){
        clientMail.replace(name, mail);
    }
    private static LinkedHashMap<String, String> getMailEdit(LinkedHashMap<String, String> clientMail){
        return clientMail;
    }
}
