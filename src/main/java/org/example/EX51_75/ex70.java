package org.example.EX51_75;

import java.util.Scanner;

public class ex70 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int r = scan.nextInt();
        int n = scan.nextInt();
        int sum = a;

        for (int i=1; i<n; i++){
            sum = sum*r;
        }
        System.out.println(sum);
    }
}
