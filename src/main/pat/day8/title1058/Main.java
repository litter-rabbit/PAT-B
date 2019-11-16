package main.pat.day8.title1058;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        String[] res = new String[m];
        int[] score = new int[m];
        for(int i=0;i<m;i++){
            String[] s = br.readLine().split(" ");
            score[i] = Integer.parseInt(s[0]);
            StringBuilder temp = new StringBuilder();
            for(int j=3;j<s.length;j++){
                temp.append(s[j]);
            }
            res[i]=temp.toString();

        }
        int errros[] = new int[m];
        int fenshu[] = new int[n];

        for(int i=0;i<n;i++){
            String[] s1=br.readLine().split(" ");
            for(int k=0;k<s1.length;k++){
                StringBuilder temp2 = new StringBuilder();
                for(int j=1;j<s1[k].length()-1;j++){
                    temp2.append(s1[k].charAt(j));
                }
                if(!temp2.toString().equals(res[k])){
                    errros[k]++;
                }
                else{
                    fenshu[i] += score[k];
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(fenshu[i]);
        }

        int max=0;
        for(int i=0;i<m;i++){
            if(errros[i]>max){
                max = errros[i];
            }
        }
        if(max!=0){

            for(int i=0;i<m;i++){
                if(errros[i]==max){

                }
            }
        }




    }
}
