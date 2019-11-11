package main.pat.day3.title1029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine().toUpperCase();
        String s2=br.readLine().toUpperCase();
        List<String> ans = new ArrayList<>();

        for(int i=0;i<s2.length();i++){
            if(s.contains(s2.charAt(i)+"")){
                s.replace(s2.charAt(i) + "", "");
            }
        }

        for(int i=0;i<s.length();i++){
            if (!ans.contains(s.charAt(i)+"")) {
                ans.add(s.charAt(i) + "");
            }
        }
        for (String k : ans) {
            System.out.print(k);
        }
    }
}
