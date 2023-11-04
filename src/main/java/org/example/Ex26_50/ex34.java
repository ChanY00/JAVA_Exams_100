package org.example.Ex26_50;

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            int num = scan.nextInt();

            if (num == 0){
                System.out.println(0);
                break;
            }
            else {
                System.out.println(num);
            }
        }
    }
}
