package main.pat.day12.title1079;

import javafx.beans.binding.StringBinding;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        int flag=0;
        while(!isre(s)){
            if(count==10){
                System.out.println("Not found in 10 iterations.");
                flag=1;
                break;
            }
            StringBuilder sb = new StringBuilder(s);
            String s1= sb.reverse().toString();
            String s2=add(s,s1);
            System.out.println(s+" + "+s1+" = "+s2);
            s=s2;
            count++;
        }
        if(flag!=1){
            System.out.println( s+" is a palindromic number.");
        }
    }

    private static String add(String s, String s1) {

        StringBuilder res = new StringBuilder();

        int carry=0;
        int a;

        for(int i=s.length()-1;i>=0;i--){
            a=s.charAt(i)-'0'+s1.charAt(i)-'0'+carry;
            res.append(a%10);
            carry=a/10;
        }
        if(carry==1){
            res.append(carry);

        }
        return res.reverse().toString();
    }


    public static boolean isre(String s1) {
        if(s1.equals("0")){
            return true;
        }
        int begin=0;
        int last=s1.length()-1;

        while(begin<last){
            if (s1.charAt(begin) != s1.charAt(last)) {
                return false;
            }
            begin++;
            last--;
        }
        return true;

    }
}
