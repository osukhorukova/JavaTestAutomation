package by.teachmeskills.lesson9.register;

import by.teachmeskills.lesson9.SaveDocument;
import by.teachmeskills.lesson9.contractonsupply.ContractOnSupply;
import by.teachmeskills.lesson9.contractwithemployee.ContractWithEmployee;
import by.teachmeskills.lesson9.document.Document;
import by.teachmeskills.lesson9.financialinvoice.FinancialInvoice;

public class Register extends Document implements SaveDocument {
    private final Document[] listOfDocuments;
    private int count;

    public Register() {
        this.listOfDocuments = new Document[10];
        this.count = 0;
    }

    public Register(Document[] listOfDocuments, int count) {
        this.listOfDocuments = listOfDocuments;
        this.count = count;
    }

    public void save(Document document) {
        if (count < 10) {
            listOfDocuments[count] = document;
            count++;
            System.out.println("The document was added to the register, you can add " + (10 - count) + " more documents");
        } else {
            System.out.println("Sorry, but the register is full");
        }
    }

    public String getInfo(Document document) {
        if (document instanceof ContractOnSupply contract) {
            return contract.printInfo();
        } else if (document instanceof ContractWithEmployee contract) {
            return contract.printInfo();
        } else if (document instanceof FinancialInvoice invoice) {
            return  invoice.printInfo();
        } else {
            System.out.println("Invalid document type");
            return null;
        }
    }
}






