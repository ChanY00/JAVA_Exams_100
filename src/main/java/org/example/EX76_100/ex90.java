package org.example.EX76_100;

import java.util.Scanner;

public class ex90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] k =new int[n];

        for (int i = 0; i < n; i++) {
            k[i] =scan.nextInt();
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.print(k[i] + " ");
        }
    }
}


