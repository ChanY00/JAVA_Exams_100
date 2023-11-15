package org.example.EX76_100;

import java.util.Scanner;

public class ex94 {
    public static void main(String[] args) {
        Scanner scna = new Scanner(System.in);
        String str = scna.nextLine();

        int count1 = 0;
        int count2 = 0;

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                count1++;
            }
            if (ch == ')') {
                count2++;
            }
        }
        System.out.println(count1+" "+count2);

    }
}
