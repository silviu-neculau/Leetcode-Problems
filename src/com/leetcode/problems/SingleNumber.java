package com.leetcode.problems;

import java.util.Arrays;

public class SingleNumber {

  public static void main(String[] args) {
    System.out.println((singleNumber(new int[] {4, 4, 2, 2, 5})));
  }

  public static int singleNumber(int[] nums) {
    if (nums.length == 1) return nums[0];
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 1; i = i + 2) if (nums[i] != nums[i + 1]) return nums[i];

    return nums[nums.length - 1];
  }
}
