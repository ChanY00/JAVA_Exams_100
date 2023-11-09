package org.example.EX76_100;

import java.util.Scanner;

public class ex77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum = sum*i;
        }
        System.out.println(sum);
    }
}
