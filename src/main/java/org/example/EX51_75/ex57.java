package org.example.EX51_75;

import java.util.Scanner;

public class ex57 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int sum = 0;

        for (int i=0; i<2; i++) {
            int num = scan1.nextInt();

            switch (num) {
                case 1:
                    int cheese = 400;
                    sum += cheese;
                    continue;
                case 2:
                    int vegetable = 340;
                    sum += vegetable;
                    continue;
                case 3:
                    int mlik = 170;
                    sum += mlik;
                    continue;
                case 4:
                    int egg = 100;
                    sum += egg;
                    continue;
                case 5:
                    int salad = 70;
                    sum += salad;
                    continue;
            }
        }
        if (sum <= 500) {
            System.out.println("no angry");
        }
        else {
            System.out.println("angry");
        }
    }
}