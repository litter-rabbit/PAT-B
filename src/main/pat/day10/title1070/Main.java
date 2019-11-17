package main.pat.day10.title1070;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        float[] arr = new float[n];
        for(int i=0;i<n;i++){
            arr[i] = Float.parseFloat(s[i]);
        }

        Arrays.sort(arr);
        if(n==2){
            System.out.println((int)Math.floor(arr[0]/2+arr[1]/2));
        }
        else{
            float sum =arr[0]/2+arr[1]/2;
            for(int i=2;i<n;i++){
                float temp =sum/2;
                float temp2=arr[i]/2;
                sum=temp+temp2;
            }
            System.out.printf("%d",(int)Math.floor(sum));
        }

    }
}
