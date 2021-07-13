package com.wellingtonblack;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

//        int myIntValue = 5;
//        float myFloatValue = 5.25f; //the f is needed because double is the default data type.
//        double myDoubleValue = 5.25d;

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; //the f is needed because double is the default data type.
        double myDoubleValue = 5d / 3d; //the precision is higher with the double. You don't need to use d, but it's a good habit.
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Challenge. Convert a given number of pounds to kilograms.

        double poundVariable = 240d;
        double kilogramsVariable = poundVariable * 0.45359237d;
        System.out.println("Converted Kilograms = " + kilogramsVariable);

        //When precise  calculations are needed we will use BigDecimal.


    }
}
