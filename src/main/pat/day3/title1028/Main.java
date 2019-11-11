package main.pat.day3.title1028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String maxname="",minname="";
        String maxbirth="1814/09/06";
        String minbirth="2014/9/6";
        int count=0;
        for(int i=0;i<n;i++){
            String[] s=br.readLine().split(" ");
            if(s[1].compareTo("1814/09/06")>=0&&s[1].compareTo("2014/9/6")<=0){
                count++;
                if(s[1].compareTo(maxbirth)>=0){
                    maxbirth = s[1];
                    maxname = s[0];
                }
                if(s[1].compareTo(minbirth)<=0){
                    minbirth = s[1];
                    minname = s[0];
                }
            }
        }
        System.out.println(count);
        if(count!=0){
            System.out.print(minname+" "+maxname);
        }


    }

}
