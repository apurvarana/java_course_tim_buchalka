package com.company;

public class Main {

    public static void main(String[] args) {
//	    int switchValue = 4;
//	    switch (switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1, 2, 3, 4 or 5");
//                break;
//        }
        char charVariable = 'A';
        switch (charVariable){
            case 'A':
                System.out.println("The variable was A");
                break;
            case 'B':
                System.out.println("The variable was B");
                break;
            case 'C':
                System.out.println("The variable was C");
                break;
            case 'D':
                System.out.println("The variable was D");
                break;
            case 'E':
                System.out.println("The variable was E");
                break;
            default:
                System.out.println("Required variable not found!");
        }
        String month= "January"; //typing january will give Not sure because String with capital J and the one with small J are different
        switch (month){
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
