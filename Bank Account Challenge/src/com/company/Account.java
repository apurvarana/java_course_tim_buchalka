package com.company;

public class Account {
    private String account_number;
    private double balance;
    private String customer_name;
    private String email;
    private String phone_number;

    public Account(){
        this("56789", 2.50,"Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String customer_name, String email, String phone_number) {
        this("9999", 100.5, customer_name,email,phone_number);
    }

    public Account(String account_number, double balance, String customer_name, String email, String phone_number){
        this.account_number = account_number;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    public String getAccount_number(){
        return account_number;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomer_name(){
        return customer_name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone_number(){
        return phone_number;
    }
    public void setAccount_number(String account_number){
        this.account_number = account_number;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomer_name(String customer_name){
        this.customer_name = customer_name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }
    public void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("The new balance after deposit is: " + this.balance);
    }
    public void withdrawFunds(double withdraw) {
        if (this.balance - withdraw < 0) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= withdraw;
            System.out.println("The new balance after withdrawal is: " + this.balance);
        }
    }
}
