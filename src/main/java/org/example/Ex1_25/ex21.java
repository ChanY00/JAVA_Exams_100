package org.example.Ex1_25;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan2.nextInt();
        int k = a * (int) Math.pow(2, b);

        if (a >= 0 & b <= 10){
            System.out.println(k);
        }
        else{
            System.out.println("잘못된 접근");
        }

    }
}
