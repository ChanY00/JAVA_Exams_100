package org.example.EX51_75;

import java.util.Scanner;

public class ex73 {
    public static void main(String[] args) {
        int rule[] = {1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60,
        7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120};

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int h = scan.nextInt();

        int money = rule[k-1] + rule[h-1];
        System.out.println(money);

    }
}
