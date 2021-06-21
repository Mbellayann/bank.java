package fr.epita.demo.bank.launcher;

import fr.epita.demo.bank.datamodel.Customer;
import fr.epita.demo.bank.datamodel.SavingAccount;

public class launcher {
    public static void main(String[] args) {
        Customer customer = new Customer();

        SavingAccount savingAccount = new SavingAccount(22980, 0.005);
        savingAccount.withDraw(300);

        double interests = savingAccount.computeInterest();
        System.out.println(interests);
    }
}
