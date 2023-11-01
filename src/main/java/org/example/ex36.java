package org.example;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int n = scan1.nextInt();
        int m = scan2.nextInt();


        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
