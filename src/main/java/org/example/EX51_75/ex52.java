package org.example.EX51_75;

import java.util.Scanner;

public class ex52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = num % 10;

        if (num2 == 1) {
            System.out.println(num+"st");
        }
        else if (num2 == 2) {
            System.out.println(num+"nd");
        }
        else if (num == 3) {
            System.out.println(num+"rd");
        }
        else {
            System.out.println(num+"th");
        }
    }
}
