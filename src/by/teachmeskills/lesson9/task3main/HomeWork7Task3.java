package by.teachmeskills.lesson9.task3main;

import by.teachmeskills.lesson9.contractonsupply.ContractOnSupply;
import by.teachmeskills.lesson9.contractwithemployee.ContractWithEmployee;
import by.teachmeskills.lesson9.financialinvoice.FinancialInvoice;
import by.teachmeskills.lesson9.register.Register;

import java.time.LocalDate;

public class HomeWork7Task3 {
    public static void main(String[] args) {
        Register register = new Register();

        FinancialInvoice financialInvoice = new FinancialInvoice(10000, "235",
                LocalDate.now(), "55ab]c1");
        register.save(financialInvoice);
        System.out.println(register.getInfo(financialInvoice));
        financialInvoice.checkAbc();
        System.out.println( );

        ContractOnSupply contractOnSupply = new ContractOnSupply("abc2200f", "Electronics",
                10000, LocalDate.of(2023, 12,13));
        register.save(contractOnSupply);
        System.out.println(register.getInfo(contractOnSupply));
        contractOnSupply.check555();
        System.out.println( );

        ContractWithEmployee contractWithEmployee = new ContractWithEmployee("333", LocalDate.now(),
                LocalDate.of(2024, 2,28),"Ivan");
        register.save(contractWithEmployee);
        contractWithEmployee.check1a2b();
        System.out.println(register.getInfo(contractWithEmployee));

    }

}
