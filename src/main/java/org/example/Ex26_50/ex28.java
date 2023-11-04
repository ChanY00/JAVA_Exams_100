package org.example.Ex26_50;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan2.nextInt();
        int c = scan3.nextInt();

        if (a % 2 == 0){
            System.out.println(a);
        }
        if (b % 2 == 0){
            System.out.println(b);
        }
        if (c % 2 == 0){
            System.out.println(c);
        }
    }
}
