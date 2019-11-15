package main.pat.day8.title1057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toLowerCase();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<='z'&& s.charAt(i)>='a') {
                sum += (s.charAt(i) - 'a') + 1;
            }
        }
        int zero=0;
        int one=0;

        while(sum!=0) {
            int temp = sum % 2;
            if (temp == 0) {
                zero++;
            } else {
                one++;
            }
            sum /= 2;
        }

        System.out.print(zero+ " "+one);

    }
}
