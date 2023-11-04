package org.example.Ex26_50;

import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int BMI = scan.nextInt();

        if (BMI <18.5) {
            System.out.println("저체중");
        }
        else if (18.5<=BMI && BMI <= 23) {
            System.out.println("정상체중");
        }
        else if (BMI > 23){
            System.out.println("과체중");
        }
    }
}
