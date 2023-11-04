package org.example.Ex26_50;

import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
