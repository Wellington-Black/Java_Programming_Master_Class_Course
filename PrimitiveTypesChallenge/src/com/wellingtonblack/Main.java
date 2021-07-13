package com.wellingtonblack;

public class Main {

    public static void main(String[] args) {

        //Challenge

        byte myByteVariable = 100;
        short myShortVariable = 10000;
        int myIntVariable = 2000000;
        long myLongVariable = 50000L + 10L  * (myByteVariable + myShortVariable + myIntVariable);
        System.out.println(myLongVariable);

    }
}
