package org.example.EX51_75;

import java.util.Scanner;

public class ex75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i=2; i<n; i++){
            if (n%i==0) {
                System.out.println("not prime");
            }
            else {
                System.out.println("prime");
            }
        }
    }
}
