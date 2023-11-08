package org.example.EX51_75;

import java.util.Scanner;

public class ex71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 0; i<num; i++) {
            int num1 = scan.nextInt();
            sum += num1;
        }
        System.out.println(sum);
    }
}
