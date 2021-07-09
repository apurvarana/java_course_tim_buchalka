package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //boolean first = true;
        while (true) {
            System.out.println("Enter number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();

//                if (first){
//                    first = false;   //USE COMMENTED OUT CODE IF ASSIGN MIN AND MAX ZERO
//                    min = number;
//                    max = number;
//                }
                if (number > max) {
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimun number: " + min + ", Maximun number : " + max);
        scanner.close();
    }
}
