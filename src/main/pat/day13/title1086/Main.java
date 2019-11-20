package main.pat.day13.title1086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;
        StringBuilder res = new StringBuilder();
        while(c!=0){
            int temp =c%10;
            c/=10;
            res.append(temp);
        }
        String resutl =res.toString();
        int begin=0;
        for(int i=0;i<resutl.length();i++){
            if(resutl.charAt(i)=='0'){
                begin++;
            }else{
                break;
            }
        }

        System.out.println(resutl.substring(begin));


    }
}
