package by.teachmeskills.lesson12.task3;

//This program creates orders and places them in the collection.
//Using a comparator, the program can sort orders by the order price.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork12Task3 {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 17696));
        orders.add(new Order(2, 4689, "Olga Ivanova"));
        orders.add(new Order(3, 300, "Carl Carlsson"));

        System.out.println("Original collection:");
        for (Order order : orders) {
            System.out.println(order);
        }

        System.out.println();

        Collections.sort(orders, new OrderComparator());

        System.out.println("Sorted collection:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

