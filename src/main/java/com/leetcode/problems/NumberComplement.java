package com.leetcode.problems;

public class NumberComplement {
    public static void main(String args[]) {
        System.out.println(findComplement(2));
    }

    public static int findComplement(int num) {

        int n = 0;
        while (n < num) {
            n = (n << 1) | 1;
        }
        return n - num;
    }
}
