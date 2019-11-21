package main.pat.day14.title1091;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        for(int i=0;i<m;i++){
            int n=sc.nextInt();
            int flag=0;
            for(int k=1;k<=9;k++){
                if(isa(n,k)){
                    System.out.println(k+" "+n*n*k);
                    flag=1;
                    break ;
                }

            }
            if(flag==0){
                System.out.println("No");
            }

        }
    }

    public static boolean isa(int n, int k){
        int a=n*n*k;

        String s1=a+"";
        String s2 = n + "";
        int len=s1.length()-1;
        for(int i=s2.length()-1;i>=0;i--){
            if (s1.charAt(len--) != s2.charAt(i)) {
                return false;
            }
        }
        return true;

    }

}
