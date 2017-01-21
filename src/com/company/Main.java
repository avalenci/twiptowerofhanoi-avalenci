package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Tower of Hanoi Game.\nThis program will solve this puzzle for you.\n" +
                "Please input number of disks to solve for:");
        Scanner input = new Scanner(System.in);
        while (!(input.hasNextInt())) {
            System.out.println("Try again.");
            input.next();
        }
        int x = input.nextInt();
        TowersOfHanoi.solve(x, 1, 2, 3);
    }
}
