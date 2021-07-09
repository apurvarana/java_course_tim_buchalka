package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        while (i <= 10){
            System.out.println("Enter the number #" + i + ":");
            boolean isAnInt =  scanner.hasNextInt();

            if (isAnInt==false){
                System.out.println("Invalid Number");
            }else{
                int number = scanner.nextInt();
                sum += number;
                i++;
            }
            scanner.nextLine();
        }
        System.out.println("The sum of the entered 10 numbers is: " + sum);
        scanner.close();
    }
}
