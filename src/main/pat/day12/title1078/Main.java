package main.pat.day12.title1078;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String code= br.readLine();
        String s = br.readLine();
        StringBuilder res = new StringBuilder();
        if(code.equals("C")){
            char pre = s.charAt(0);
            int  count=1;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==pre){
                    count++;
                }
                else{
                    if(count!=1){
                        res.append(count);
                        count=1;
                    }
                    res.append(pre);
                    pre = s.charAt(i);
                }

            }
            if(count!=1){
                res.append(count);
            }
            res.append(pre);
            System.out.println(res.toString());
        }
        else{
            int count=0;
            char c;
            int flag=0;
            for(int i=0;i<s.length();i++){
                c = s.charAt(i);
                if(c<='9'&&c>='0'){
                    count = count * 10 + c - '0';
                }
                else{
                    if(count==0){
                        res.append(c);
                    }
                    for(int k =0;k<count;k++){
                        res.append(c);
                    }
                    count=0;
                }

            }
            System.out.println(res.toString());

        }


    }
}
