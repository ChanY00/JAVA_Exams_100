package org.example.Ex26_50;

import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[5];

        num[0] = n/10000;
        num[1] = (n/1000) % 10;
        num[2] = (n/100) % 10;
        num[3] = (n/10) % 10;
        num[4] = n % 10;

        String str = "";
        for(int i=0; i<5; i++){
            if(num[i] == 1){
                str += "일";
            }
            else if (num[i] == 2){
                str += "이";
            }
            else if (num[i] == 3){
                str += "삼";
            }
            else if (num[i] == 4){
                str += "사";
            }
            else if (num[i] == 5){
                str += "오";
            }
            else if (num[i] == 6){
                str += "육";
            }
            else if (num[i] == 7){
                str += "칠";
            }
            else if (num[i] == 8){
                str += "팔";
            }
            else if (num[i] == 9){
                str += "구";
            }
            if(i==0 && num[0]>=1){
                str += "만";
            }
            if(i==1 && num[1]>=1){
                str += "천";
            }
            if(i==2 && num[2]>=1){
                str += "백";
            }
            if(i==3 && num[3]>=1){
                str += "십";
            }
            System.out.println(str);
        }
        System.out.println(str);
    }
}
