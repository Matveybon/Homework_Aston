package com.aston.homework;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("    fly me    to the moon    "));
    }

    public static Integer lengthOfLastWord(String string) {
        string = string.trim();
        int lastSpaceIndex = string.lastIndexOf(' ');
        return string.length() - lastSpaceIndex - 1;
    }
}
