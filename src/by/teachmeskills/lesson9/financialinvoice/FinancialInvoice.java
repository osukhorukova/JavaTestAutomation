package by.teachmeskills.lesson9.financialinvoice;

import by.teachmeskills.lesson9.document.Document;

import java.time.LocalDate;

public class FinancialInvoice extends Document {
    int amountOfMoneyForMonth;
    int codeOfTheDepartment;
    public FinancialInvoice(){
    }

    public FinancialInvoice(int amountOfMoneyForMonth, String codeOfTheDepartment, LocalDate date, String documentNumber) {
        super(date, documentNumber);
        this.amountOfMoneyForMonth = amountOfMoneyForMonth;

    }

    public int getAmountOfMoneyForMonth(){
        return amountOfMoneyForMonth;
    }

    public int getCodeOfTheDepartment(){
        return codeOfTheDepartment;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "; Amount of money for month: " + getAmountOfMoneyForMonth() + "; Code of teh department: " +
                getCodeOfTheDepartment();
    }
}
