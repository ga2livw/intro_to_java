package com.tijch02;

public class Date {

    public static void main(String [] args) {

        String day = "Sunday";
        String month = "November";

        int date = 10;
        int year = 2002;

        printDate(day, month, year);

    }


    static void printDate(String day, String month, int year) {
        System.out.println("American Format: " + day + ", " + month + " " + year);
    }

}