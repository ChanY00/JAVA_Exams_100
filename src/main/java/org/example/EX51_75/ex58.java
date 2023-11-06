package org.example.EX51_75;

import java.util.Scanner;

public class ex58 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        int a = scan1.nextInt();
        int b = scan1.nextInt();
        int c = scan1.nextInt();

        if (c < a+b) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
