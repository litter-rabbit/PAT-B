package main.pat.day5.title1038;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[100005];
        String[] s=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            score[Integer.parseInt(s[i])]+=1;
        }
        String[] s1=br.readLine().split(" ");
        int k = Integer.parseInt(s1[0]);
        int flag=0;

        for(int i=1;i<k+1;i++){
            int tempscore = Integer.parseInt(s1[i]);
            if(flag==1){
                System.out.print(" " + score[tempscore]);
            }
            else{
                System.out.print(score[tempscore]);
                flag=1;
            }
        }

    }
}
