package com.wellingtonblack;

public class Main {

    public static void main(String[] args) {

        //Int. Has a width of 32 bits.

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimun Value = " + myMinIntValue);
        System.out.println("Integer Maximun Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); //Overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); //Underflow

        int myMaxIntTest = 2147483647;

        //Byte. Occupies 8 bits. Width of 8.

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimun Value = " + myMinByteValue);
        System.out.println("Byte Maximun Value = " + myMaxByteValue);

        //Short. Width of 16 bits.

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimun Value = " + myMinShortValue);
        System.out.println("Short Maximun Value = " + myMaxShortValue);

        //Long. Width of 64.

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimun Value = " + myMinLongValue);
        System.out.println("Long Maximun Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        //We use casting to avoid the error. In this case we are casting int into byte.
        //If you don't specify type, int is assumed automatically by Java.

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValues = (short) (myMinShortValue / 2);

    }
}
