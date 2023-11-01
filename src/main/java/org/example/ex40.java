package org.example;

import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float ball = scan.nextFloat();

        if (50 <= ball && ball <= 60){
            System.out.println("win");
        }
        else{
            System.out.println("lose");
        }
    }
}
