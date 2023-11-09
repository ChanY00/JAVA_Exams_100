package org.example.EX76_100;

import java.util.Scanner;

public class ex80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Caesar = scan.nextLine();

        for (int i = 0; i < Caesar.length(); i++) {
            char ch = Caesar.charAt(i);
            if (ch >= 'd' && ch <='z') {
                System.out.print((char)(ch-3));
            }
            else if (ch >= 'a' && ch <= 'c') {
                System.out.print((char)(ch+23));
            }
            else{
                System.out.print(ch);
            }

        }
    }
}
