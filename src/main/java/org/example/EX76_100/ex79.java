package org.example.EX76_100;

import java.util.Scanner;

public class ex79 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if (c>='a' && c<='z')
                System.out.print((char)(c-32));
            else if (c>='A' && c<='Z')
                System.out.print((char)(c+32));
        }

    }
}
