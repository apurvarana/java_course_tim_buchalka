package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array ={1,2,3,4,5};
        reverse(array);
        int[] array1 ={1,2,3,4,5,6};
        reverse(array1);
    }
    private static void reverse(int[] array){
        int temp = 0;
        System.out.println("Array = " + Arrays.toString(array));
        int[] reversedArray = Arrays.copyOf(array,array.length);
        int number = reversedArray.length-1;
        for (int i= 0; i< number/2; i++){
            temp = reversedArray[i];
            reversedArray[i] = reversedArray[number-i];
            reversedArray[number-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }
}
