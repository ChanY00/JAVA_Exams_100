package org.example.Ex1_25;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        int year = scan1.nextInt();
        int month = scan2.nextInt();
        int day = scan3.nextInt();

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
