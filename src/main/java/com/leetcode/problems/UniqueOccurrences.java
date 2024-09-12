package com.leetcode.problems;

import java.util.Arrays;

// https://leetcode.com/problems/unique-number-of-occurrences/

public class UniqueOccurrences {

    public static void main(String[] args) {
        System.out.println((uniqueOccurrences(new int[] {1, 2, 0})));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        int k = 1000;
        int numberOfTimes[] = new int[2 * k + 1];

        for (int num : arr) {
            numberOfTimes[num + k]++;
        }

        Arrays.sort(numberOfTimes);

        for (int i = 0; i < 2 * k; i++) {
            if (numberOfTimes[i] != 0 && numberOfTimes[i] == numberOfTimes[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
