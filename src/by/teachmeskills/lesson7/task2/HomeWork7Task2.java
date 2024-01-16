package by.teachmeskills.lesson7.task2;

public class HomeWork7Task2 {
    public static void main(String[] args) {
        Employee director = new Director();
        Employee handyman = new Handyman();
        Employee accountant = new Accountant();
        System.out.println("Position: " + director.getPosition());
        System.out.println("Position: " + handyman.getPosition());
        System.out.println("Position: " + accountant.getPosition());
    }
}
