package main.pat.day3.title1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum=0;
        int[] num =new int[]{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        int[] keymp=new int[]{1,0,10,9,8,7,6,5,4,3,2};
        for(int i=0;i<n;i++){
            String s= br.readLine();
            if(!isvalid(s,keymp,num)){
                System.out.println(s);
                sum++;
            }
        }

        if(sum==0){
            System.out.print("All passed");
        }
    }

    public static boolean isvalid(String s,int[] keymap,int[] num) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9'){
                return false;
            }
            sum+=(s.charAt(i)-'0')*num[i];
        }
        int temp =(s.charAt(17)=='X') ? 10:(s.charAt(17)-'0');
        return temp==keymap[sum%11];

    }
}
