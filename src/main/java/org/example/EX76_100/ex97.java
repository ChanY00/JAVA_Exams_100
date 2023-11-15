package org.example.EX76_100;

import java.util.Scanner;

public class ex97 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentCount = scan.nextInt();
        int placeCount = scan.nextInt();
        int[] heigth = new int[100];
        for(int i=0; i<studentCount; i++) {
            heigth[i] = scan.nextInt();
        }
        for(int i=0; i<studentCount; i++) {
            for(int j=i+1; j<studentCount; j++) {
                if(heigth[i]>heigth[j]) {
                    int temp = heigth[i];
                    heigth[i] = heigth[j];
                    heigth[j] = temp;
                }
            }
        }

        for(int i=0; i<studentCount; i++) {
            System.out.print(heigth[i]+",");

            if(i!= 0 && (i+1)%placeCount == 0)
                System.out.println();
        }
    }
}
