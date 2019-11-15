package main.pat.day7.title1048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String a = s[0];
        String b = s[1];
        String res = "";
        int len=a.length()-1;
        int lenb=b.length()-1;
        int flag=1;
        for(;lenb>=0;lenb--){
           if(len>=0){
               if(flag==0){
                   int i1 = b.charAt(lenb) - a.charAt(len--);
                   int temp= i1 >=0? i1 : i1 +10;
                   res=temp+res;
                   flag=1;
               }
               else if(flag==1){
                   int i2 = (b.charAt(lenb)-'0') +(a.charAt(len--)-'0');
                   if (i2 % 13 == 10) {
                    res="J"+res;
                   } else if (i2 % 13 == 11) {
                       res="Q"+res;
                   } else if (i2 % 13 == 12) {
                       res="K"+res;
                   }
                   else{
                       res=(i2%13)+res;
                   }
                   flag=0;
               }
           }
           else{
               break;
           }
        }
        if(lenb>=0){
            String sub = b.substring(0, lenb + 1);
            res=sub+res;
        }

        System.out.print(res);

    }
}
