package by.teachmeskills.lesson8;

// This program extends class Phone and creates three phones with different nu,bers, models and weights. Besides,
// it uses methods receiveCall and sendMessage to show who is calling to the phone and to whom the phone will send
// the message.

public class HomeWork8Task1 extends Phone {
    public static void main(String[] args) {

        Phone iPhone = new Phone();
        iPhone.setNumber("89991111111");
        iPhone.setModel("iPhone 15");
        iPhone.setWeight(500.3);
        System.out.println("Number:" + iPhone.getNumber() + ", " + "Model " + iPhone.getModel() + ", " + "Weight " +
                iPhone.getWeight());
        System.out.println(iPhone.receiveCall("Marina"));

        System.out.println("-----------------------");

        Phone Poco = new Phone();
        Poco.setNumber("89992222222");
        Poco.setModel("Xiaomi Poco x4");
        Poco.setWeight(450.6);
        System.out.println("Number:" + Poco.getNumber() + ", " + "Model " + Poco.getModel() + ", " + "Weight " +
                Poco.getWeight());
        System.out.println(Poco.receiveCall("Misha", "899983567876"));

        System.out.println("-----------------------");

        Phone Samsung = new Phone();
        Samsung.setNumber("899933333331");
        Samsung.setModel("Samsung Galaxy 9+");
        Samsung.setWeight(600.9);
        System.out.println("Number:" + Samsung.getNumber() + ", " + "Model " + Samsung.getModel() + ", " + "Weight " +
                Samsung.getWeight());
        String[] numbersToSend = new String[]{"89993679087", "89991123456"};
        System.out.println(Samsung.sendMessage(numbersToSend, "Hello! Have a nice day!"));

    }
}
