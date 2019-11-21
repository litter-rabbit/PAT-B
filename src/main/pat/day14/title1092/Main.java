package main.pat.day14.title1092;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        int[] score = new int[m+1];
        for(int i=0;i<n;i++){
            s=br.readLine().split(" ");
            for(int k=1;k<=s.length;k++){
                score[k]+=Integer.parseInt(s[k-1]);
            }
        }
        int[] index=new int[m+1];
        int len=0;
        int max=-1;
        for(int i=1;i<score.length;i++){
            if(score[i]>max){
                max = score[i];
                index=new int[m+1];
                len=0;
                index[len++]=i;
            }
            else if(score[i]==max){
                index[len++]=i;
            }
        }
        System.out.println(max);
        int flag=0;
        for(int i=0;i<len;i++) {
            if (flag == 1) {
                System.out.print(" " + index[i]);
            } else {
                System.out.print(index[i]);
                flag = 1;
            }

        }
    }
}
