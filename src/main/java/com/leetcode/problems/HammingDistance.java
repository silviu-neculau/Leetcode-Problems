package com.leetcode.problems;

// https://leetcode.com/problems/hamming-distance/

public class HammingDistance {

    public static void main(String args[]) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        int num = x ^ y;
        int count = 0;
        while (num != 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
    }
}
