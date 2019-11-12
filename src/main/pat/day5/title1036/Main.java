package main.pat.day5.title1036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s= br.readLine().split(" ");
        Double n = Double.parseDouble(s[0]);
        String c = s[1];
        StringBuilder firstrow = new StringBuilder();
        for(int i=0;i<n;i++){
            firstrow.append(c);
        }
        System.out.println(firstrow.toString());
        double nextrow=n/2;
        if((nextrow-(int)nextrow)>=0.5){
            nextrow+=1;
        }
        StringBuilder nextrowprint = new StringBuilder();
        nextrowprint.append(c);
        for(int i=0;i<n-2;i++){
            nextrowprint.append(" ");
        }
        nextrowprint.append(c);
        for(int i=0;i<(int)(nextrow-2);i++){
            System.out.println(nextrowprint.toString());

        }
        System.out.print(firstrow);


    }
}
