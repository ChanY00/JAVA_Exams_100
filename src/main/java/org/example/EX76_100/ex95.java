package org.example.EX76_100;

import java.util.Scanner;

public class ex95 {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z' )
            {
                int index = c - 97;//a -> 0
                counts[index]++;
            }
        }
        for(int i=0; i<counts.length; i++) {
            System.out.println((char)('a'+i)+
                    ":"+ counts[i]);
        }



    }
}
