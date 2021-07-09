package com.company;

public class Main {

    public static void main(String[] args) {
//	int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
        calcFeetAndInchesToCentimeters(15, 1);
        calcFeetAndInchesToCentimeters(181);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){ //Overload method same name but different number of arguements
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){ // Second overload method
        System.out.println("No player name, no player score.");
        return 0;
    }

    //Challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || (inches < 0 || inches > 12)){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double feetToCenti = ((double) feet * 12d) * 2.54d;
        double inchesToCenti = (double) inches * 2.54d;
        System.out.println(feet + " Feet and " + inches + " Inches = " + (feetToCenti+inchesToCenti) + " cms.");
        return feetToCenti + inchesToCenti;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feetInInches = (int) inches / 12d;
        System.out.println(feetInInches + " Feet = " + inches + " inches.");
        inches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters((int) feetInInches, inches);

    }
    }

