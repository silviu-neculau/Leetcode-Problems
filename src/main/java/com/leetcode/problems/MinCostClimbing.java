package com.leetcode.problems;

// https://leetcode.com/problems/min-cost-climbing-stairs/

public class MinCostClimbing {

    public static void main(String[] args) {
        System.out.println((minCostClimbingStairs(new int[] {1, 2, 0})));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int twoStepBefore = cost[0];
        int oneStepBefore = cost[1];
        int current= 0;
        for (int i = 2; i < cost.length; i++) {
            current = Math.min(twoStepBefore, oneStepBefore) + cost[i];
            twoStepBefore = oneStepBefore;
            oneStepBefore = current;
        }
        return Math.min(oneStepBefore, twoStepBefore);
    }
}
