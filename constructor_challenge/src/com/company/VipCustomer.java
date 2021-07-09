package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default name", 3.55,"Default email");
    }
    public VipCustomer(String name, double creditLimit){
        this(name,creditLimit,"Default email2");
    }
    public VipCustomer(String name, double creditLimit, String email){
        this.name =  name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
