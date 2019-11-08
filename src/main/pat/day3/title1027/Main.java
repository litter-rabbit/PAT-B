package main.pat.day3.title1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int row=0;
        for(int i=0;i<n;i++){
            if ((2 * i * (i + 2) + 1) > n) {
                row=i-1;
                break;
            }
        }

        for(int i=row;i>=1;i--){
            for(int k=row-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=i*2+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            System.out.print(" ");
        }
        System.out.println("*");
        for(int i=1;i<=row;i++){
            for(int k=row-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=i*2+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print(n-(2*row*(row+2)+1));




    }


}
