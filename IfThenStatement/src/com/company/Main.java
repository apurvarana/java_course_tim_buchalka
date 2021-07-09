package com.company;

public class Main {

    public static void main(String[] args) {
	boolean isAlien = false;
	if (isAlien == false) {
        System.out.println("It is not an alien!");
        System.out.println("And I am scared of aliens");
    }

	int topScore = 80;
	if(topScore >= 100){
        System.out.println("You got the highest score!");
    }

	int secondTopScore = 95;
	if ((topScore > secondTopScore) && (topScore < 100)){
        System.out.println("Greater than second top score and less than 100");
    }
	if ((topScore > 90) || (secondTopScore <= 90)){
        System.out.println("Either or both of the conditions are true");
    }

	int newValue =  50; //assignment operator
	if (newValue == 50){ //equal to operator
        System.out.println("This is true");
    }

	boolean isCar =  false;
	if (isCar == true) { // isChar value is boolean hence no error on using assignment operator
        System.out.println("This isn't supposed to happen");
    }
    isCar = true;
	boolean wasCar = isCar ? true : false;
	if (wasCar){
        System.out.println("wasCar is true ");
    }

	//Challenge
    double variable1 = 20.00d;
	double variable2 = 80.00d;
	double bothVariables = (variable1 + variable2) * 100.00d;
	double remainder = bothVariables % 40.00d;
	boolean isRemainder = (remainder == 0) ? true : false;
        System.out.println(isRemainder);
    if (!isRemainder){
        System.out.println("Got some remainder");
    }






    }
}
