package main.pat.day5.title1039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s1 = br.readLine();
        int[] book = new int[256];
        for(int i=0;i<s.length();i++){
            book[s.charAt(i)]++;
        }
        int resutl=0;
        for(int i=0;i<s1.length();i++){
            if(book[s1.charAt(i)]>0){
                book[s1.charAt(i)]--;
            }
            else{
                resutl++;
            }
        }

        if(resutl==0){
            System.out.print("Yse"+" "+(s.length()-s1.length()));
        }
        else {
            System.out.print("No"+" "+resutl);
        }

    }

}
