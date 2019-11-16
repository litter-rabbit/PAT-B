package main.pat.day9.title1061;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();

        int[] score = new int[m];
        int[] ans = new int[m];

        for(int i=0;i<m;i++){
            score[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            ans[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                int temp=sc.nextInt();
                if (temp==ans[j]) {
                    sum += score[j];
                }
            }

            System.out.println(sum);

        }

    }
}
