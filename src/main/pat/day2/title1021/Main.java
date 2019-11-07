package main.pat.day2.title1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int[] arr=new int[10];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=0;
//        }
        for (char c : s.toCharArray()) {
            arr[c-'0']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println(i + ":" + arr[i]);
            }
        }
    }

}
