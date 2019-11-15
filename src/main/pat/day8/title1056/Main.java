package main.pat.day8.title1056;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int sum=0;
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                int a = Integer.parseInt(s[i]);
                int b = Integer.parseInt(s[j]);
                int temp =a*10+b;
                int temp2=b*10+a;
                sum=sum+temp+temp2;
            }
        }
        System.out.print(sum);


    }
}
