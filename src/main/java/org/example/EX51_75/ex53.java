package org.example.EX51_75;

import java.util.Scanner;

public class ex53 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int a = scan1.nextInt();
        int b = scan2.nextInt();

        float[] num = new float[6];
        float max = 0;
        num[0] = a+b;
        num[1] = a-b;
        num[2] = b-a;
        num[3] = a*b;
        num[4] = a/b;
        num[5] = b/a;

        for (int i = 0; i<num.length; i++) {
            if(max<num[i]) {
                max=num[i];
            }
        }
        System.out.println(max);
    }
}
