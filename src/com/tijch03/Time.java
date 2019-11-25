package com.tijch03;

public class Time {

    public static void main(String [] args) {
        int hour = 20;
        int min = 14;
        int second = 30;

        System.out.println(convertToSecond(hour, min, second));

    }

    public static int convertToSecond(int hour, int min, int second) {
        return(hour*60*60 + min*60 + second);
    }


}
