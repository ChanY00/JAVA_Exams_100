package org.example.EX51_75;

import java.util.Scanner;

public class ex74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i=1; i<=N; i++){
            if (N%i==0) {
                System.out.printf("%d ",i);
            }
        }
    }
}
