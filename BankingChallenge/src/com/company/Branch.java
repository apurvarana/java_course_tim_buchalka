package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName){
        this.name = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName(){
        return name;
    }
    public boolean newCustomer(String customerName, double initialTransaction){
       if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName,initialTransaction));
            return true;
       }
       return false;
    }
    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
           existingCustomer.addTransaction(transaction);
           return true;
        }
        return false;
    }
    private Customer findCustomer(String customerName){
       for (int i=0; i<this.customers.size(); i++){
           Customer customer = customers.get(i);
           if (customer.getName().equals(customerName)){
               return customer;
           }
       }
       return null;
    }
}
