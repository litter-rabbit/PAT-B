package main.pat.day1.title1013;

import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        String[] s= br.readLine().split(" ");
        int begin=Integer.parseInt(s[0]);
        int last = Integer.parseInt(s[1]);
        int sum=0;
        boolean flag=false;
        int count=0;
        for(int i=2;i<=2100000000;i++){
            if(isprimer(i)){
                sum++;
                if(sum>=begin){
                    count++;
                    if(flag){
                        System.out.print(" "+i);
                    }
                    else{
                        System.out.print(i);
                        flag=true;
                    }
                }
                if(count==10){
                    System.out.println();
                    count=0;
                    flag=false;
                }
                if(sum==last){
                    break;
                }
            }
        }
    }

    public static boolean isprimer(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if((n%i)==0){
                return false;
            }
        }
        return true;
    }
}