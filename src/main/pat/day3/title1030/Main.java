package main.pat.day3.title1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        double p = Double.parseDouble(s[1]);
        String[] s1 = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(arr);
        int maxlen=0;
        for(int i=0;i<n;i++){
            for(int j=i+maxlen;j<n;j++){
                if(arr[j]<=arr[i]*p){
                    maxlen++;
                }
                else{
                    break;
                }
            }
        }
        System.out.print(maxlen);
    }
}
