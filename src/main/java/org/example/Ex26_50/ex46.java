package org.example.Ex26_50;

import java.util.Scanner;

public class ex46 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan1.nextInt();
        int c = scan1.nextInt();
        int car = 170;

        if (car < a){
            System.out.println("PASS");
        }
        else {
            System.out.println("CRASH");
        }
        if (car < b){
            System.out.println("PASS");
        }
        else {
            System.out.println("CRASH");
        }
        if (car < c){
            System.out.println("PASS");
        }
        else {
            System.out.println("CRASH");
        }
    }
}
