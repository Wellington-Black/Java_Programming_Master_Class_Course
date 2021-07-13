package com.wellingtonblack;

public class Main {

    public static void main(String[] args) {

        //Char has a width of 16. The reason is to allow storing of Unicode characters
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        //Boolean

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true; 


    }
}
