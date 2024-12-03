package com.leetcode.problems;

// https://leetcode.com/problems/maximum-69-number/

public class Maximum69 {

    public static void main(String[] args) {
        System.out.println((maximum69Number(6963453)));
    }

    public static int maximum69Number(int num) {

        int add = 0;
        int step = 1;
        int temp = num;

        while (temp > 0) {
            int lastDigit = temp % 10;
            temp /= 10;

            if (lastDigit == 6) {
                add = 3 * step;
            }
            step *= 10;
        }
        return num + add;
    }
}
