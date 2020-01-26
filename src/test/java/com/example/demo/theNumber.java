package com.example.demo;

public class theNumber {
    public static void main(String[] args) {

        int x = -20;
        int y = 20;

        if (x > 0 && y > 0) {
            System.out.println("false");
        }
        else if (x < 0 || y < 0) {
            System.out.println("yes");
        }
        else
            System.out.println("both numbers are positive");
    }

}