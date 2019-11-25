package com.tijch03;

import java.util.*;

public class ConvertTemperature {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a temperature " +
                "in Celcius in your current location: ");

        Double c = in.nextDouble();
        Double f = c * 9 / 5 + 32;
        Double f1d = (double) Math.round(f * 10d) / 10d;
        System.out.println("The temperature in Fahrenheit is: " + f1d);

    }
}
