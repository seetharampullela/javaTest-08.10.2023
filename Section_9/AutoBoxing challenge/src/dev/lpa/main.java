package dev.lpa;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}

public class main {
    public static void main(String[] args) {
        Customer cus = new Customer("Mani", 100000.98);
        System.out.println(cus);

        Bank bank = new Bank("Chance");
        bank.addNewCustomer("Jane A",50);
        System.out.println(bank);

        bank.addTransaction("Jane A",-10.25);
        bank.addTransaction("Jane A",-75.01);
        bank.printStatement("Jane a");
    }

}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);
    public Bank (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank {" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {
        for (var customer: customers) {
            if(customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }
    public void addNewCustomer(String customerName, double initialDeposit) {
        if(getCustomer(customerName)==null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println(("New customer added: " + customer));
        }
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if(customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if(customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions: ");
        for(double d: customer.transactions()) { // unboxing
            System.out.printf("$%10.2f (%s)%n",d,d<0?"Debit":"Credit");
        }
    }
}
