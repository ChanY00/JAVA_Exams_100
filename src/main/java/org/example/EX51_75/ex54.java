package org.example.EX51_75;

import java.util.Scanner;

public class ex54 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan2.nextInt();


        if (b%a == 0) {
            int x = b/a;
            System.out.println(a+"*"+x+"="+b);
        }
        else if (a%b == 0) {
            int x = a/b;
            System.out.println(b+"*"+x+"="+a);
        }
        else {
            System.out.println("none");
        }
    }
}
