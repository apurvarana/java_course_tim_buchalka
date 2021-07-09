package com.company;

public class Main {

    public static void main(String[] args) {
       Account bobsAccount =  new Account(); //("12345", 0.00 , "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        System.out.println(bobsAccount.getAccount_number());
        System.out.println(bobsAccount.getBalance());
       bobsAccount.withdrawFunds(100.0);

       bobsAccount.depositFunds(50.0);
       bobsAccount.withdrawFunds(100.0);

       bobsAccount.depositFunds(51.0);
       bobsAccount.withdrawFunds(100.0);




    }
}
