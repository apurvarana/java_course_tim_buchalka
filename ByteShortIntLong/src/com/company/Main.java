package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Integer: " + myMinIntValue);
        System.out.println("Maximum Integer: " + myMaxIntValue);
        System.out.println("Busted Max Value: " + (myMaxIntValue+1));//Represents Overflow
        System.out.println("Busted Min Value: " + (myMinIntValue-1));//Represents Underflow

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum byte value: " + myMinByteValue);
        System.out.println("Maximum byte value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum byte value: " + myMinShortValue);
        System.out.println("Maximum byte value: " + myMaxShortValue);

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("Minimum long value: " + myMinlongValue);
        System.out.println("Maximum long value: " + myMaxlongValue);

        int myTotal = (myMinIntValue/2);

        byte myNewByteValue = (byte) (myMinByteValue/2);

        short myNewShortValue = (short) (myMinShortValue/2);

        //Challenge
        byte byteVariable= (byte) 10;
        short shortVariabe= (short) 20;
        int intVariable= 50;
        long longVariable= (50000L + (10L *(byteVariable+shortVariabe+intVariable)));
        System.out.println(longVariable);
    }
}
