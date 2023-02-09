package interfaces;

import java.util.ArrayList;

public class Account implements AccountInterface {
    private String name;
    private int accountNumber;
    private double balance;
    private ArrayList<Double> spendings;

    public Account(String name, int accountNumber, double balance, ArrayList<Double> spendings) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.spendings = spendings;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getName() {
        return "";
    }

    public double addSpending(double spending) {
        spendings.add(spending);
        return spending;
    }

    public ArrayList<Double> getSpendings() {
        return null;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", spendings=" + spendings +
                '}';
    }
}
