package com.leetcode.problems;

import java.util.Arrays;

//

public class IfExists {

    public static void main(String args[]) {
        System.out.println(checkIfExist(new int[] {1, 2, 3}));
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int left = 0, right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target && mid != i) {
                    return true;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}
