package org.example.EX51_75;

import java.util.Scanner;

public class ex69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int d = scan.nextInt();
        int n = scan.nextInt();

        for (int i=a; i<=(d*n);i+=d){
            System.out.println(i);
        }
    }
}
