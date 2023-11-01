package org.example.Ex1_25;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan2.nextInt();
        int c = scan3.nextInt();

        float abc = ((a+b+c) / 3);

        System.out.println(a+b+c);
        System.out.printf("%.1f", abc);
    }
}
