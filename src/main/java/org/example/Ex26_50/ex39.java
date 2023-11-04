package org.example.Ex26_50;

import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan2.nextInt();
        int c = scan3.nextInt();

        if (a<b & a<c){
            System.out.println(a);
        }
        else if (b<a & b<c){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
