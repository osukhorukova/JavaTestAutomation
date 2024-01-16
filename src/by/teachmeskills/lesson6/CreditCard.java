package by.teachmeskills.lesson6;

// This class defines a bank card with two parameters - account number and the current amount of money on it. It has
// methods that add money on card and withdraw some money from it. Also, there is a method showing the current
// amount of money on the card.

public class CreditCard {
    String accountNumber;
    int balance;

    CreditCard(String accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    int addMoney(int moneyToAdd) {
        balance += moneyToAdd;
        return balance;
    }

    int withdrawMoney(int moneyToWithdraw) {
        if (moneyToWithdraw > balance) {
            System.out.println("You exceeded the current balance on your card. Your current balance: " + balance);
        } else {
            balance -= moneyToWithdraw;
        }
        return balance;

    }

    int currentInformationABoutTheCard() {
        System.out.println("Your current balance: " + balance);
        return balance;
    }


}


