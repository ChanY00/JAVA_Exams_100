package org.example.EX51_75;

import java.util.Scanner;

public class ex60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a <= 170) {
            System.out.println("CRUSH "+ a);
        }
        else if (b <= 170) {
            System.out.println("CRUSH "+ b);
        }
        else if (c <= 170) {
            System.out.println("CRUSH "+ c);
        }
        else {
            System.out.println("PASS");
        }
    }
}
