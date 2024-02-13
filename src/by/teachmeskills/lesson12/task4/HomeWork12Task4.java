package by.teachmeskills.lesson12.task4;

import java.time.LocalDate;
import java.util.*;


public class HomeWork12Task4 {
    public static void main(String[] args) {

        Client client1 = new Client(LocalDate.now(), "Roman", 30, "Male", "8476567987");
        Client client2 = new Client(LocalDate.now(), "Helena", 25, "Female","2345676543");


        Order order1 = new Order(10.99, "A bag of oranges", 1);
        Order order2 = new Order(19.99, "Pizza and one cup of tea", 2);
        Order order3 = new Order(5.99, "Popcorn", 3);
        Order order4 = new Order(13.50, "Candy Bar", 1);
        Order order5 = new Order(20.00, "Chicken breast", 2);
        Order order6 = new Order(9.99, "Potato", 3);

        client1.addOrder(order1);
        client1.addOrder(order2);
        client2.addOrder(order3);
        client2.addOrder(order4);
        client2.addOrder(order5);
        client2.addOrder(order6);

        // Create a map to store client passport number -> client class object
        HashMap<String, Client> clientMap = new HashMap<>();
        clientMap.put(client1.getPassportNumber(), client1);
        clientMap.put(client2.getPassportNumber(), client2);

        // Loop through the map and display key-value pairs
        for (Map.Entry<String, Client> entry : clientMap.entrySet()) {
            System.out.println("Passport Number: " + entry.getKey());
            System.out.println("Client: " + entry.getValue().getName());
            System.out.println("Registration Date: " + entry.getValue().getRegistrationDate());
            System.out.println("Age: " + entry.getValue().getAge());
            System.out.println("Gender: " + entry.getValue().getGender());
            System.out.println("Orders: " + entry.getValue().getOrders());
            System.out.println();
        }

        Iterator<Map.Entry<String, Client>> mapIterator = clientMap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, Client> entry = mapIterator.next();
            String passportNumber = entry.getKey();
            Client client = entry.getValue();
            System.out.println("Passport Number: " + passportNumber);
            System.out.println("Client: " + client);
        }
        System.out.println();

        // Loop through the map and display keys
        for (String passportNumber : clientMap.keySet()) {
            System.out.println("Passport Number: " + passportNumber);
        }

        System.out.println();

        // Loop through the map and display values
        for (Client client : clientMap.values()) {
            System.out.println("Client: " + client.getName());
            System.out.println("Registration Date: " + client.getRegistrationDate());
            System.out.println("Age: " + client.getAge());
            System.out.println("Gender: " + client.getGender());
            System.out.println("Orders: " + client.getOrders());
            System.out.println();
        }
    }
}
