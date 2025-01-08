package com.aston.homework;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        int[] ints = {1,2,2,3,4,5,5,6,7,8,8,9};
        getDistinctNumbers(ints);
    }

    public static void getDistinctNumbers(int[] ints) {
        Set<Integer> distinctNumbers = new LinkedHashSet<>();
        for (int num : ints) {
            distinctNumbers.add(num);
        }

        System.out.println(distinctNumbers);
    }
}
