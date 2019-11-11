package main.pat.day4.title1033;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] arghs)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        Map<Character, Boolean> badkey = new HashMap<>();
        for (char c : first.toCharArray()) {
            badkey.put(c, true);
            if(c>='A'&&c<='Z'){
                badkey.put((char)(c + ('a' - 'A')), true);
            }
        }
        String input = br.readLine();
        boolean flag=false;
        StringBuilder res = new StringBuilder();
        if (badkey.containsKey('+')) {
            flag=true;
        }
        for (char c : input.toCharArray()) {
            if (badkey.containsKey(c)) {
                continue;
            }
            if(c>='A'&&c<='Z'&&flag){
                continue;
            }
            res.append(c);
        }
        System.out.println(res.toString());

    }
}
