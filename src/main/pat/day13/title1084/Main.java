package main.pat.day13.title1084;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int d= sc.nextInt();
        int n = sc.nextInt();
        System.out.println(solution(n,d+""));

    }


    public static String solution(int n,String s) {
        if(n==1){
            return s;
        }
        String str = solution(n - 1, s);
        StringBuilder res = new StringBuilder();
        int count=1;
        char pre = str.charAt(0);
        for(int i=1;i<str.length();i++){
            if (str.charAt(i) == pre) {
                count++;
            }
            else{
                res.append(pre);
                res.append(count);
                pre = str.charAt(i);
                count=1;
            }
        }
        res.append(pre);
        res.append(count);
        return res.toString();

    }
}

