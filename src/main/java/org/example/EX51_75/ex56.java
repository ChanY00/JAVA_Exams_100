package org.example.EX51_75;

import java.util.Scanner;

public class ex56 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan2.nextInt();
        int c = scan3.nextInt();
        int d = scan4.nextInt();

        if (a+b+c+d == 1) {
            System.out.println("도");
        }
        else if (a+b+c+d == 2) {
            System.out.println("개");
        }
        else if (a+b+c+d == 3) {
            System.out.println("걸");
        }
        else if (a+b+c+d == 4) {
            System.out.println("윷");
        }
        else if (a+b+c+d == 0) {
            System.out.println("모");
        }
        else {
            System.out.println("잘못된 접근");
        }
    }
}
