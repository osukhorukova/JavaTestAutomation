package by.teachmeskills.lesson9.contractwithemployee;

import by.teachmeskills.lesson9.document.Document;

import java.time.LocalDate;

public class ContractWithEmployee extends Document {
    LocalDate contractExpirationDate;
    String nameOfEmployee;

    public ContractWithEmployee(){
    }

    public ContractWithEmployee(String documentNumber, LocalDate date, LocalDate contractExpirationDate, String nameOfEmployee){
        super(date, documentNumber);
        this.contractExpirationDate = contractExpirationDate;
        this.nameOfEmployee = nameOfEmployee;
    }

    public LocalDate getContractExpirationDate() {
        return contractExpirationDate;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "; Name of employee: " + getNameOfEmployee() + "; Expiration Date: " + getContractExpirationDate();
    }
}
