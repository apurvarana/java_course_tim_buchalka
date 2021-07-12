package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number = readInteger();
        System.out.println(number);
	int[] myArray = readElements(number);
        System.out.println(findMin(myArray));
    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int numOfElements = scanner.nextInt();
        return numOfElements;
    }

    private static int[] readElements(int number){
        Scanner scanner = new Scanner(System.in);
        int[] array= new int[number];
        for (int i=0; i<number; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] arrayToCheck){
        int[] array = Arrays.copyOf(arrayToCheck, arrayToCheck.length);
        int min=Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++){
            int value = array[i];
            if (value < min){
                min= value;
            }
        }
        return min;
    }
}
