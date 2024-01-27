package by.teachmeskills.lesson9.document;

import by.teachmeskills.lesson9.NumberEndsWith1a2bException;
import by.teachmeskills.lesson9.NumberHasAbcException;
import by.teachmeskills.lesson9.NumberStartsWith555Exception;

import java.time.LocalDate;

public abstract class Document {
    private LocalDate date;
    private String documentNumber;

    public Document() {
    }

    public Document(LocalDate date, String documentNumber) {
        this.date = date;
        this.documentNumber = documentNumber;
    }

    public String printInfo() {
        return "Date: " + getDate() + "; Document number: " + getDocumentNumber();
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void checkAbc() throws NumberHasAbcException {
        try {NumberHasAbcException.checkAbc(documentNumber);
        } catch (NumberHasAbcException e) {
            System.out.println("!!! The document number doesn't contain *abc* in it !!!");;
        }
    }

    public void check555() throws NumberStartsWith555Exception {
        try {NumberStartsWith555Exception.check555(documentNumber);
        } catch (NumberStartsWith555Exception e) {
            System.out.println("!!! The document number doesn't start with *555* !!!");;
        }
    }

    public void check1a2b() throws NumberEndsWith1a2bException {
        try {NumberEndsWith1a2bException.check1a2b(documentNumber);
        } catch (NumberEndsWith1a2bException e) {
            System.out.println("!!! The document number doesn't end with *1a2b* !!!");;
        }
    }

}