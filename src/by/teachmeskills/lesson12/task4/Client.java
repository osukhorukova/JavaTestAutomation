package by.teachmeskills.lesson12.task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private final LocalDate registrationDate;
    private final String name;
    private final int age;
    private final String gender;
    private final String passportNumber;
    private final List<Order> orders;

    public Client(LocalDate registrationDate, String name, int age, String gender, String passportNumber) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.passportNumber = passportNumber;
        this.orders = new ArrayList<>();
    }
    public void addOrder(Order order) {
        orders.add(order);
    }
    public List<Order> getOrders() {
        return orders;
    }
    public int getAge() {
        return age;
    }
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String toString() {
        return getName() + ", orders: " + getOrders() + ")";
    }
}
