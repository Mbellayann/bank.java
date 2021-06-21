package fr.epita.demo.bank.datamodel;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double intialBalance, double interestRate){
        this.setBalance(intialBalance);
        this.setInterestRate(interestRate);

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double computeInterest(){
        return this.interestRate * this.getBalance();
    }

    public double withDraw(double amount){
        double balance = this.getBalance() - amount;
        double newBalance = this.setBalance(balance);
        return newBalance;
    }
}
