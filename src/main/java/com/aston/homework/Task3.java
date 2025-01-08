package com.aston.homework;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        Integer secondMaxElement = findSecondMaxElement(arr);

        if (secondMaxElement != null) {
            System.out.println("Второй по величине элемент массива: " + secondMaxElement);
            }else{
            System.out.println("Массив пуст");
        }
    }

    public static Integer findSecondMaxElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        // Находим максимальный элемент
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // Ищем элемент, который больше всех, кроме максимального
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((secondMax < arr[i]) && (arr[i] != max)) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}
