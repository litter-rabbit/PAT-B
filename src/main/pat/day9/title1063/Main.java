package main.pat.day9.title1063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double max =-1;
        String[] s = null;
        for(int i=0;i<n;i++){
            s=br.readLine().split(" ");
            double a =Double.parseDouble(s[0]);
            double b = Double.parseDouble(s[1]);
            double temp = Math.sqrt(a*a+b*b);
            if(temp>max){
                max=temp;
            }
        }

        System.out.printf("%.2f",max);


    }
}
