package main.pat.day1.title1017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        String a = s[0];
        int b=Integer.parseInt(s[1]);
        char[] chars=a.toCharArray();
        int remain = (chars[0] - '0') / b;
        if ((remain != 0 && chars.length > 1) || chars.length == 1) {
            System.out.print(remain);
        }
        StringBuilder resutl = new StringBuilder();
        int temp=(chars[0]-'0')%b;
        for (int i = 1; i < chars.length; i++) {
            remain = temp * 10 + (chars[i] - '0');
            resutl.append(remain / b);
            temp=remain%b;
        }
        System.out.print(resutl.toString());
        System.out.print(" "+temp);


    }
}
