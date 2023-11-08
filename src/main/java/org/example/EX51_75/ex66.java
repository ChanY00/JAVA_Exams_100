package org.example.EX51_75;

import java.util.Scanner;

public class ex66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        for (int i=1; i<=num;i++){
            sum += i;
            if(sum>=num){
                break;
            }
        }
        System.out.println(sum);
    }
}
