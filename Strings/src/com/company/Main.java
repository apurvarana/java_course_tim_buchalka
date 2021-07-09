package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more"; //we can append string using a + operator automatically
        System.out.println(myString);
        myString = myString + " \u0044 2021";
        System.out.println(myString);
        String number_string = "250.99";
        System.out.println(number_string);
        number_string = number_string + " 56.09"; //string treats digits or text as text only
        System.out.println(number_string);
        String lastString = "10";
        int myInt= 50;
        lastString = lastString + myInt; //int is appended to string as laststring was defined as string
        System.out.println(lastString);
    }
}
