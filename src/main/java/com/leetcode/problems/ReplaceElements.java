package com.leetcode.problems;

// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

public class ReplaceElements {

    public static void main(String[] args) {
        System.out.println((replaceElements(new int[] {1, 2, 0})));
    }

    public static int[] replaceElements(int[] array) {
        int maxSoFar = array[array.length - 1];
        array[array.length - 1] = -1;
        for (int i = array.length - 2; i > -1; i--) {
            int currentValue = array[i];
            array[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, currentValue);
        }
        return array;
    }
}
