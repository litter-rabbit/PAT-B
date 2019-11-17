package main.pat.day10.title1067;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        String pass = s[0];
        int n = Integer.parseInt(s[1]);

        String temp;
        int count=0;
        while(!(temp=br.readLine()).equals("#")){
            if(temp.equals(pass)){
                System.out.println("Welcome in");
                break;
            }
            else{
                System.out.println("Wrong password: "+temp);
                count++;
                if(count>=n){
                    System.out.println("Account locked");
                    break;
                }
            }


        }


    }
}
