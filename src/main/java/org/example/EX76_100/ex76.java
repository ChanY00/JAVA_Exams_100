package org.example.EX76_100;

import java.util.Scanner;

public class ex76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int sum=0;

        for (int i=0; i<k; i++){
            sum += n*n;
        }
        System.out.println(sum);
    }
}
