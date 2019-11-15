package main.pat.day8.title1054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int errorcount=0;
        double temp;
        double sum=0;
        for(int i=0;i<n;i++){
            try{
                temp = Double.parseDouble(s[i]);
                int len=0;
                for(int j=1;j<s[i].length();j++){
                    if(s[i].charAt(j)=='.'){
                        len=s[i].length()-j-1;
                        break;
                    }
                }
                if(temp<-1000||temp>1000||len>=3){
                    System.out.printf("ERROR: %s is not a legal number\n",s[i]);
                    errorcount+=1;
                    continue;
                }
                sum+=temp;
            }catch ( NumberFormatException e){
                errorcount+=1;
                System.out.printf("ERROR: %s is not a legal number\n",s[i]);
            }

        }
        if(errorcount==n){
            System.out.println("The average of 0 numbers is Undefined");
        }
        else{
            System.out.printf("The average of %d numbers is %.2f",n-errorcount,sum/(n-errorcount));
        }

    }
}
