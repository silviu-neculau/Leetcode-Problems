package com.leetcode.problems;

// https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println((searchInsert(new int[]{1,3,2}, 6)));
    }

    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
