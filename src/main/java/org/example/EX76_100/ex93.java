package org.example.EX76_100;

import java.util.Scanner;

public class ex93 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Arr = new int[11];

        for(int i=1; i<Arr.length; i++){
            Arr[i] = scan.nextInt();
        }
        int knum = scan.nextInt();

        System.out.println(Arr[knum]);


    }
}
