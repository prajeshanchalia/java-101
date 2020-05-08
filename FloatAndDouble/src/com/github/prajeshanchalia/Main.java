package com.github.prajeshanchalia;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value: " + myMinFloatValue);
        System.out.println("Float Max Value: " + myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value: " + myMinDoubleValue);
        System.out.println("Double Max Value: " + myMinDoubleValue);

        double challengePounds = 200d;
        double challengePoundsToKilograms = challengePounds * 0.45359237d;
        System.out.println(challengePounds + " Pounds = " + challengePoundsToKilograms + " Kilograms");
        
    }
}
