package org.example;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a == 12 & a >= 1 & a <=2) {
            System.out.println("winter");
        }
        else if (a>=3 & a<=5){
            System.out.println("spring");
        }
        else if (a>=6 & a<=8){
            System.out.println("summer");
        }
        else if (a>=9 & a<=11){
            System.out.println("fall");
        }
    }
}
