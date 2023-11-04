package org.example.Ex26_50;

import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan2.nextInt();
        int c = scan3.nextInt();
        double d = b*b - 4*a*c;

        if(d < 0){
            System.out.println("값 존재x");
        }
        else if(d == 0){
            double d1 = -b / (2*a);
            System.out.println(d1);
        }
        else {
            double x1 = ((-b) + Math.sqrt(d) ) / (2 * a);
            double x2 = ((-b) - Math.sqrt(d) ) / (2 * a);
            System.out.printf("%.02f\n",x1);
            System.out.printf("%.02f\n",x2);
        }

    }
}
