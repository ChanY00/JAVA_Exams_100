package org.example.EX51_75;

import java.util.ArrayList;
import java.util.Scanner;

public class ex72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int max = 0;
        ArrayList arr = new ArrayList();

        for (int i = 0; i<num; i++) {
            int num1 = scan.nextInt();
            arr.add(num1);
            if (max < (int)arr.get(i)){
                max = (int)arr.get(i);
            }
        }
        System.out.println(max);
    }
}
