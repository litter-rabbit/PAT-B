package main.pat.day3.title1029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();
        String s= br.readLine();
        for (char c : s.toCharArray()) {
           if(c>='a'&&c<='z'){
               c -= ('a' - 'A');
           }
            map.put(c, 1);
        }
        String s1 = br.readLine();
        for (char c : s1.toCharArray()) {
            if(c>='a'&&c<='z'){
                c -= ('a' - 'A');
            }
            if (map.containsKey(c)) {
                map.put(c, 2);
            }
        }
        StringBuilder res = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1){
                res.append(entry.getKey());
            }
        }
        String result=res.toString();
        Map<Character, Integer> flag = new HashMap<>();

        for (char c : s.toCharArray()) {

            if(isvalid(c,result)&&!flag.containsKey(c)){
                flag.put(c, 1);
                flag.put((char)(c + ('a' - 'A')),1);
                if(c>='a'&&c<='z'){
                    c -= ('a' - 'A');
                }
                System.out.print(c);
            }
        }

    }

    public static boolean isvalid(char c,String s){
        if(c>='a'&&c<='z'){
            c -= ('a' - 'A');
        }
        for (char c1 : s.toCharArray()) {
            if(c1==c){
                return true;
            }
        }
        return false;

    }
}
