package org.example.EX76_100;

import java.util.Scanner;

public class ex81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
        for (int i=0; i<5;i++){
            num[i] = scan.nextInt();
        }

        int max=0;
        for (int i=0; i<5; i++){
            if (max<num[i]){
                max=num[i];
            }
        }
        System.out.println(max);

        int min=Integer.MAX_VALUE;
        for (int i=0; i<5; i++){
            if (min>num[i]){
                min=num[i];
            }
        }
        System.out.println(min);

    }
}
