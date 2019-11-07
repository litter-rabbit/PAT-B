package main.pat.day2.title1024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split("E");
        int n = Integer.parseInt(s[1]);
        if(s[0].charAt(0)=='-'){
            System.out.print('-');

        }
        s[0] = s[0].substring(1);

        if(n<0){
            System.out.print("0.");
            for(int i=0;i<Math.abs(n)-1;i++){
                System.out.print("0");
            }
            for(int i=0;i<s[0].length();i++){
                if(s[0].charAt(i)!='.'){
                    System.out.print(s[0].charAt(i));
                }
            }
        }
        else{

            

        }






    }

}
