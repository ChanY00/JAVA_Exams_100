package org.example.Ex26_50;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int c = scan1.nextInt();

        if (c%2 == 0){
            System.out.println("plus");
        }
        else{
            System.out.println("minus");
        }
        if (c%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
