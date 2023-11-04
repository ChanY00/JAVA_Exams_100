package org.example.Ex26_50;

import java.util.Scanner;

public class ex49 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int hours = scan1.nextInt();
        int minute = scan2.nextInt();

        int hours2 = hours-1;
        int minute2 = minute-30;

        if (minute < 30){
            System.out.println(hours2 +" "+(60+minute2));
        }
        else {
            System.out.println(hours +" "+ minute2);
        }
    }
}
