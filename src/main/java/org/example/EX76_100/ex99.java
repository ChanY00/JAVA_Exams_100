package org.example.EX76_100;

import java.util.Scanner;

public class ex99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lotation = scan.nextInt();

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            arr[i] = num;
        }

        for (int a = 0; a < lotation; a++) {

            int tmp = 0;
            for (int i = 0; i < 5; i++) {
                if ((i + 1) == 5) {
                } else {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}

