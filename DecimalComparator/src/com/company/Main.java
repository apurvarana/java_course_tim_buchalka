package com.company;
//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//        The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
//
//        * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
//
//        * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
//
//        * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
//
//
//        TIP: Use paper and pencil.
//
//        TIP: Use casting.
//
//        NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a  main method to solution code.
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean areEqualByThreeDecimalPlaces(double parameter1, double parameter2){
        double number1 = parameter1 * 1000d;
        double number2 = parameter2 * 1000d;

        int digit11 = (int) number1 / 1000;
        int digit12 = (int) number1 / 100;
        int digit13 = (int) number1 / 10;
        int digit14 = (int) number1 % 10;

        int digit21 = (int) number2 / 1000;
        int digit22 = (int) number2 / 100;
        int digit23 = (int) number2 / 10;
        int digit24 = (int) number2 % 10;

        if (digit11 == digit21){
            if (digit12 == digit22){
                if (digit13 == digit23){
                    if (digit14 == digit24){
                        return true;
                    }else return false;
                }else return false;
            }else return false;
        }else return false;
    }
}
