package main.pat.day6.title1042;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s=s.toLowerCase();
        int[] count = new int[256];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]+=1;
        }

        int max=0;
        for(int i='a';i<='z';i++){
            if (count[i] > max) {
                max = count[i];
            }
        }
        int flag=0;
        for(int i='a';i<='z';i++){
            if (count[i] == max) {
                System.out.print((char)i+" "+max);
                break;
                 }

        }

    }
}
