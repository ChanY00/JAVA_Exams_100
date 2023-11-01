package org.example;

import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ball = scan.nextInt();

        if (50 <= ball && ball <= 70){
            System.out.println("win");
        }
        else if(ball % 6 == 0){
            System.out.println("win");
        }
        else {
            System.out.println("lose");
        }
    }
}
