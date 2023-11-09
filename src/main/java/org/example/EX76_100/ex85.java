package org.example.EX76_100;

import java.util.Scanner;

public class ex85 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
