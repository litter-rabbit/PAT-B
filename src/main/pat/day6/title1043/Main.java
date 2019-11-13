package main.pat.day6.title1043;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int p=0;
        int a=0;
        int T=0;
        int e=0;
        int s=0;
        int t=0;
        for(int i=0;i<string.length();i++){
            if (string.charAt(i) == 'P') {
                p++;
            }
            else if (string.charAt(i) == 'A') {
                a++;
            }
            else if (string.charAt(i) == 'T') {
                T++;
            }
            else if (string.charAt(i) == 'e') {
                e++;
            }
            else if (string.charAt(i) == 's') {
                s++;
            }
            else if (string.charAt(i) == 't') {
                t++;
            }

        }
        int sum=s+t+e+T+a+p;

        StringBuilder res = new StringBuilder();
        while(res.length()!=sum){
            if(p!=0){
                res.append("P");
                p--;
            }
            if (a != 0) {
                res.append("A");
                a--;
            }
            if (T!= 0) {
                res.append('T');
                T--;
            }
            if (e != 0) {
                res.append("e");
                e--;
            }
            if (s != 0) {
                res.append("s");
                s--;
            }
            if (t != 0) {
                res.append("t");
                t--;
            }

        }

        System.out.print(res.toString());


    }
}
