package org.example.Ex1_25;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.length() <= 50){
            System.out.println(input);
        }
        else {
            System.out.println("잘못된 글자 수");
        }

    }
}
