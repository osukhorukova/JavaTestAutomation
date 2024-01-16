package by.teachmeskills.lesson6;

// This program creates 3 credit cards using class "CreditCard". We add money on card 1 and card2
// and withdraw money from card3. After that, we show current amount of money for all cards.

public class HomeWork6 {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1111 1111 1111 1111",1000000);
        CreditCard card2 = new CreditCard("2222 2222 2222 2222",2000000);
        CreditCard card3 = new CreditCard("3333 3333 3333 3333",30);
        card1.addMoney(3000);
        card2.addMoney(10000);
        card3.withdrawMoney(700);
        System.out.println("-------------------------");
        card1.currentInformationABoutTheCard();
        card2.currentInformationABoutTheCard();
        card3.currentInformationABoutTheCard();
    }
}
