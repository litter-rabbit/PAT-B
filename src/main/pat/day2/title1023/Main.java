package main.pat.day2.title1023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int flag=0;
        if(s[0].equals("0")){
            flag=1;
        }
        StringBuilder result=new StringBuilder();

        for(int i=flag;i<s.length;i++){
            if(flag==1){
                for(int j=0;j<Integer.parseInt(s[i]);j++){
                    result.append(i);
                }
            }
            if(flag==0){
                for(int j=0;j<Integer.parseInt(s[i]);j++) {
                    result.append(i);
                }
            }

        }

        char[] res=result.toString().toCharArray();
        if (res[0] == '0') {
            for(int i=1;i<res.length;i++){
                if(res[i]!='0'){
                    char temp=res[i];
                    res[i]='0';
                    res[0]=temp;
                    break;
                }
            }
        }
        System.out.print(new String(res));
    }
}
