package com.company;

public class TowersOfHanoi {
    public static void solve(int n, int start, int next, int end) {
        if (n == 1) {
            System.out.println("Move one disk from tower " + start + " to " + end);
        } else {
            solve(n - 1, start, end, next);
            System.out.println("Move one disk from tower " + start + " to " + end);
            solve(n - 1, next, start, end);
        }
    }
}
