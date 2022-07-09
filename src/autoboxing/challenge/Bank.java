package autoboxing.challenge;

import java.util.ArrayList;

public class Bank {

    ArrayList<Branch> branches = new ArrayList<>();

    // add a new branch to the branches arraylist
    // add a customer to that branch with initial transaction
    // add a transaction for existing customer in the branch
    // show a list of customers by branch
    // show a list of the customer's transactions
    // demonstrate autoboxing and unboxing in the code
    // hint: transactions
    // add data validation
    //e.g. check if exists, or does not exist, etc.
    // think about where you are adding code to perform certain actions

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBranch("Chesterfield");
        bank.getBranch("Chesterfield").addCustomer("Michael Muther", 1000.00);
        Branch chesterfield = bank.getBranch("Chesterfield");
        chesterfield.addTransaction("Michael Muther", 300.00);
        System.out.println("TEST: " + chesterfield.getCustomer("Michael Muther").getBalance());
        chesterfield.getCustomer("Michael Muther").printBalance();
        chesterfield.getCustomer("Michael Muther").printTransactions();
        chesterfield.printCustomers();
    }

    public void addBranch(String branchName) {
        branches.add(new Branch(branchName));
    }

    public Branch getBranch(String branchName) {
        for(Branch b : branches) {
            if(b.getBranchName().equals(branchName)) {
                return b;
            }
        }
        System.out.println("Query failure: Branch does not exist!");
        return null;
    }
}
