package com.aston.homework;

public class Task5 {
    public static void main (String[] args) {
        System.out.println(isPalindrome("abc"));
        System.out.println(isPalindrome("112233"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("112211"));

    }

    public static boolean isPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
