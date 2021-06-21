package fr.epita.demo.bank.datamodel;

public class Account {
    private double balance;
    private int id;
    /**
     * this are the properties of the accoounts
     */
    public Account(){
        /**
         * this is the constructor of the accounet
         */
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
