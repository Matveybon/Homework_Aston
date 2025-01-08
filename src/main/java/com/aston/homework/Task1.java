package com.aston.homework;

public class Task1 {
    public static void main(String[] args) {
        String string = "I Love Java";
        turnString(string);
    }
    public static void turnString(String string) {
        String reversedstring = new StringBuilder(string).reverse().toString();
        System.out.println(reversedstring);
    }
}