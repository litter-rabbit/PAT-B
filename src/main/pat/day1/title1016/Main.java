package main.pat.day1.title1016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String A = s1[0];
        int da = Integer.parseInt(s1[1]);
        String B = s1[2];
        int db = Integer.parseInt(s1[3]);
        long pa=0;
        long pb=0;
        for (char c : A.toCharArray()) {
            if ((c - '0') == da) {
                pa = pa * 10 + (c - '0');
            }
        }
        for (char c : B.toCharArray()) {
            if ((c - '0') == db) {
                pb = pb * 10 + (c - '0');
            }
        }
        System.out.print(pa + pb);
    }

}
