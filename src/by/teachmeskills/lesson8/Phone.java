package by.teachmeskills.lesson8;

import java.util.Arrays;

public class Phone {
    protected String number;
    protected String model;
    protected double weight;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
    }

    protected String getNumber() {
        return number;
    }

    protected void setNumber(String number) {
        this.number = number;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight can't be negative");
        }
    }

    public String receiveCall(String name) {
        return name + " is calling";
    }

    public String receiveCall(String name, String number) {
        return name + " (" + number + ") is calling";
    }

    public String sendMessage(String[] numbersToSend, String message) {
        return "Message \"" + message + "\" will be sent to the following numbers: " + Arrays.toString(numbersToSend);
    }
}
