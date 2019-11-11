package main.pat.day3.title1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        double c1 = Double.parseDouble(s[0]);
        double c2 = Double.parseDouble(s[1]);
        double secoundsum=(c2-c1)/100;
        int secound = (int) secoundsum;
        double onesecound = (secoundsum-secound)>=0.5?1:0;
        secound+=onesecound;
        int hour=secound/3600;
        secound=secound%3600;
        int minute=secound/60;
        secound=secound%60;

        System.out.printf("%02d:%02d:%02d",hour,minute,secound);


    }
}
