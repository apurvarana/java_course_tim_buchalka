package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1+2;
        System.out.println("Addition Result = " + result);
        int previous_result = result;
        System.out.println("Previous result = " + previous_result);
        result = result - 1;
        System.out.println("Subtraction result = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("Multiplication result = " + result);

        result = result/5; // 20 / 5 = 4
        System.out.println("Division result = " + result);

        result = result % 3; // the remainder of 4 % 3
        System.out.println("Remainder result = " + result);

        //result = result + 1
        result ++; // 1 + 1 = 2
        System.out.println("Abbreviation result = " + result);

        result--; // 2 - 1 = 1
        System.out.println("Abbreviation2 result = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("New result = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("Abbreviated multiplication result = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("Abbreviated division result = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("Abbreviated subtraction result = " + result);
    }
}
