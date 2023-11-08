package org.example.EX51_75;

import java.util.Scanner;

public class ex61 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        int num1 = scan1.nextInt();
        String cal = scan1.next();
        int num2 = scan1.nextInt();

        switch (cal) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
        }
    }
}
