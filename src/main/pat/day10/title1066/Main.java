package main.pat.day10.title1066;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        int a = Integer.parseInt(s[2]);
        int b = Integer.parseInt(s[3]);
        int color = Integer.parseInt(s[4]);
        for(int i=0;i<m;i++){
            String[] temp = br.readLine().split(" ");
            int flag=0;
            for(int j=0;j<temp.length;j++){
                int tempcolor = Integer.parseInt(temp[j]);
                if(tempcolor>=a&&tempcolor<=b){
                    if(flag==1){
                        System.out.printf(" %03d",color);
                    }
                    else{
                        System.out.printf("%03d",color);
                        flag=1;
                    }
                }
                else{
                    if(flag==1){
                        System.out.printf(" %03d",tempcolor);
                    }
                    else{
                        System.out.printf("%03d",tempcolor);
                        flag=1;
                    }

                }
            }
            System.out.println();
        }
    }
}
