package main.pat.day10.title1069;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int  n= Integer.parseInt(s[1]);
        int s1 = Integer.parseInt(s[2]);
        Map<String, Integer> map = new HashMap<>();

        if(s1>m){
            System.out.println("Keep going...");
            System.exit(0);

        }


        for(int k=0;k<s1-1;k++){
            br.readLine();
        }
        System.out.println(br.readLine());
        int count=0;
        for(int i=0;i<m-s1;i++){
            String temp = br.readLine();
            count++;
            if(count%n==0){
                if(!map.containsKey(temp)){
                    System.out.println(temp);
                    map.put(temp, 1);
                }
                else{
                    count--;
                }

            }

        }

    }
}
