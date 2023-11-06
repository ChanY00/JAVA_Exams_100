package org.example.EX51_75;

import java.util.Scanner;

public class ex55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();

        if (0 <= score && score < 60){
            System.out.println("F");
        }
        else if (60 <= score && score < 70){
            System.out.println("D");
        }
        else if (70 <= score && score < 80){
            System.out.println("C");
        }
        else if (80 <= score && score < 90){
            System.out.println("B");
        }
        else if (90 <= score && score <= 100){
            System.out.println("A");
        }
        else {
            System.out.println("잘못된 접근");
        }
    }
}
