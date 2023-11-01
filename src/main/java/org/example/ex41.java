package org.example;

import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ball = scan.nextInt();

        if (30 <= ball && ball <= 40){
            System.out.println("win");
        }
        else if (60 <= ball && ball <= 70){
            System.out.println("win");
        }
        else{
            System.out.println("lose");
        }
    }
}
