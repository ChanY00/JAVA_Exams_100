package org.example.Ex26_50;

import java.util.Scanner;

public class ex48 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int num = scan1.nextInt();
        int gender = scan2.nextInt();
        int num2 = (num / 10000) + 1;

        if (gender == 1 || gender == 3){
            System.out.println(2018-(1900+num2));
        }
        else if (gender == 2 || gender == 4){
            System.out.println(2018-(2000+num2));
        }
    }
}

