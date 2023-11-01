package org.example;

import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = 0;

        for (int i = 1 ; i < num ; i++){
            if (i % 2 == 0){
                a += i;
            }
        }
        System.out.println(a);
    }
}
