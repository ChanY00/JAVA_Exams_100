package org.example.EX76_100;

import java.util.Scanner;

public class ex86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = (n/2)+1;

        for (int i = 1; i <= m; i++) {
            for (int k=i;k<m;k++){
                System.out.print(" ");
            }
            for (int j = 2; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
