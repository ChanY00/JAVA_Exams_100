package org.example.EX76_100;

import java.util.Scanner;

public class ex78 {
    public static void main(String[] args) {
        int num1;
        int num2;
        char op;

        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();

        int result = num1;

        while(true)
        {
            String input = scan.next();
            op = input.charAt(0);
            if(op == '=') {
                System.out.println(result);
                break;
            }

            num2 = scan.nextInt();

            if(op == '+') {
                result = result + num2;
            }else if(op == '-') {
                result = result - num2;
            }else if(op == '*') {
                result = result * num2;
            }else if(op == '/') {
                result = result / num2;
            }
        }
    }
}
