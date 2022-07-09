package autoboxing.challenge;

import java.util.ArrayList;

public class Customer {

    private String customerName;

    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String customerName, double initialDeposit) {
        this.customerName = customerName;
        transactions.add(initialDeposit); // this demonstrates autoboxing as we are adding a double to a Double arrayList.
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void printTransactions() {
        int i =1;
        System.out.println("\n" + customerName + "'s transactions:");
        for(Double d : transactions) {
            System.out.println(i + ". " + d);
            i++;
        }
    }

    public double getBalance() {
        double balance = 0;
        for(Double d : transactions) {
            balance += d; // unboxing here as d is a Double, not a double
        }
        return balance;
    }

    public void printBalance() {
        double balance = 0;
        for(Double d : transactions) {
            balance += d; // unboxing here as d is a Double, not a double
        }
        System.out.println(customerName + "'s current balance is: " + getBalance());
    }
}
