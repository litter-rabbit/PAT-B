package main.pat.day4.title1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxscore=0;
        int maxnumber=-1;
        int[] score=new int[100005];
        for(int i=0;i<n;i++){
            String[] s =br.readLine().split(" ");
            int num = Integer.parseInt(s[0]);
            int sc = Integer.parseInt(s[1]);
            score[num]+=sc;
            if(score[num]>maxscore){
                maxscore = score[num];
                maxnumber=num;
            }
        }

        System.out.print(maxnumber+" "+maxscore);
    }
}
