package autoboxing.challenge;

import java.util.ArrayList;

public class Branch {

    private String branchName;

    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public boolean addCustomer(String customerName, double initialDeposit) {
        // if initial deposit is negative, return false
        if(initialDeposit <= 0) {
            System.out.println("Add Customer failed: Initial deposit must be positive.");
            return false;
        }
        // check all customers to see if the name already exists, return false
        for(Customer c : customers) {
            if(c.getCustomerName().equals(customerName)) {
                System.out.println("Add Customer failed: Customer already exists.");
                return false;
            }
        }
        customers.add(new Customer(customerName, initialDeposit)); // add customer with initial deposit and return true
        System.out.println("Add Customer completed: " + customerName + " has an initial balance of " + initialDeposit + " at the " + branchName + " branch.");
        return true;
    }

    public boolean addTransaction(String customerName, double transaction) {
        for(Customer c : customers) {
            if (c.getCustomerName().equals(customerName)) {
                if (c.getBalance() + transaction < 0) {
                    System.out.println("Transaction failed: Insufficient funds.");
                    return false;
                } else {
                    c.getTransactions().add(transaction);
                    System.out.println("Transaction completed: " + customerName + " has a new balance of " + c.getBalance() + " at the " + branchName + " branch.");
                    return true;
                }
            }
        }
        System.out.println("Transaction failed: Customer does not exist at the " + branchName + " branch.");
        return false;
    }

    public String getBranchName() {
        return branchName;
    }

    public Customer getCustomer(String customerName) {
        for(Customer c : customers) {
            if (c.getCustomerName().equals(customerName)) {
                return c;
            }
        }
        System.out.println("Query failure: customer does not exist!");
        return null;
    }

    public void printCustomers() {
        int i = 1;
        System.out.println("\nCustomers at the " + branchName + " branch:");
        for (Customer c : customers) {
            System.out.println(i + ". " + c.getCustomerName());
            i++;
        }
    }

    // need to be able to add new customer - DONE
    // each customer has an initial transaction - DONE
    // need to be able to add additional transactions for that customer/branch - DONE
}
