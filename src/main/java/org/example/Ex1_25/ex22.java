package org.example.Ex1_25;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan2.nextInt();

        if (a>b) {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}
