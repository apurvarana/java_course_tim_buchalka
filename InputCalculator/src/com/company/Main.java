package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        double count = 0;
        int sum = 0;
        long average = 0L;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int value = scanner.nextInt();
                sum += value;
                count++;
            } else if (count == 0) {
                System.out.println("SUM = 0 AVG = 0");
                break;
            } else {
                average = (long) Math.ceil( sum / (count));
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
