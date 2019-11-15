package main.pat.day7.title1049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        ArrayList<Float> pre = new ArrayList<>();
        float res=0;
        for(int i=0;i<n;i++){
            float temp=0;
            pre.add(Float.parseFloat(s[i]));
            for(int j=0;j<pre.size();j++){
                temp += (j + 1) * pre.get(j);
            }
            res+=temp;
        }
        System.out.printf("%.2f",res);
    }
}
