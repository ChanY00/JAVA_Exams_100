package org.example.EX51_75;

import java.util.Scanner;

public class ex51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int num2 = num / 10;
        int num3 = num % 10;
        int result = ((num3 * 10) + num2) * 2;
        System.out.println(result);

        if (1 <= num && num <= 99) {
            if (result <= 50) {
                System.out.println("GOOD");
            } else {
                System.out.println("OH MY GOD");
            }
        }else {
            System.out.println("잘못된 값");
        }
    }
}