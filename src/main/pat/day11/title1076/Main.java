package main.pat.day11.title1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] temp = br.readLine().split(" ");
            for(int j=0;j<temp.length;j++){
                if(temp[j].charAt(2)=='T'){
                    System.out.print(temp[j].charAt(0)-'A'+1);
                    break;
                }
            }
        }

    }
}
