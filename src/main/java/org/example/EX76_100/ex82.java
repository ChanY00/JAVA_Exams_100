package org.example.EX76_100;

import java.util.Scanner;

public class ex82 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for (int i=1; i<10; i++){
            System.out.println(num1+"*"+i+"="+num1*i);
        }
        for (int i=1; i<10; i++){
            System.out.println(num2+"*"+i+"="+num2*i);
        }
    }
}
