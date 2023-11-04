package org.example.Ex26_50;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int c = scan1.nextInt();

        if (90 <= c && c<= 100){
            System.out.println("A");
        }
        else if (70 <= c && c<= 89){
            System.out.println("B");
        }
        else if (40 <= c && c<= 69){
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}
