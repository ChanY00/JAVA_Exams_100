package org.example.Ex26_50;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan2.nextInt();

        System.out.printf("%d", a>b ? a:b);
    }
}
