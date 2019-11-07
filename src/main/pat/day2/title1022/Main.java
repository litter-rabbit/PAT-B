package main.pat.day2.title1022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1=br.readLine().split(" ");
        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        int d = Integer.parseInt(s1[2]);

        int sum=a+b;
        StringBuilder result = new StringBuilder();
        while (sum != 0) {
            result.append(sum % d);
            sum/=d;
        }
        System.out.print(result.reverse().toString());
    }
}
