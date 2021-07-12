package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array =  getIntegers(5);
        int[] sorted = sortIntegers(array);
        printArray(array);
        printArray(sorted);


    }

    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for (int i=0; i<array.length; i++){
            System.out.println("Enter number " + (i+1) + ":  ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] arrayToPrint){
        for (int i=0; i<arrayToPrint.length; i++){
            System.out.println("Element " + i + " contents " + arrayToPrint[i]);
        }
    }

    public static int[] sortIntegers(int[] arrayToSort ){
        int[] sortedArray = new int[arrayToSort.length];

        for (int i=0; i< arrayToSort.length; i++) { //manually sorting array
            sortedArray[i] = arrayToSort[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++)
                if (sortedArray[i] <sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]= sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
            }
        }
        return sortedArray;
    }
}

