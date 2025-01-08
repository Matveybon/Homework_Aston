package com.aston.homework;

public class Task2_v2 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
                getDistinctNumbers(ints);
        }

        public static void getDistinctNumbers(int[] ints) {
        int[] temp = new int[ints.length];
        int index = 0;

        for (int i = 0; i < ints.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (ints [i] == temp [j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp [index++] = ints [i];
            }
        }
        for (int i =0; i < index; i++) {
            System.out.print(temp[i] + "");
        }
    }
}
