package org.example.EX51_75;

import java.util.Scanner;

public class ex62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.printf(a+"%02d"+"%03d", b,c);
    }
}
