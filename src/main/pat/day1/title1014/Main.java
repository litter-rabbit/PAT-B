package main.pat.day1.title1014;

import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s1=br.readLine().toCharArray();
        char[] s2=br.readLine().toCharArray();
        char[] s3=br.readLine().toCharArray();
        char[] s4=br.readLine().toCharArray();
        boolean flag=false;
        String[] days=new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};
        for(int i=0;i<s1.length;i++){
            if(s1[i]==s2[i]&&s1[i]>=65&&s1[i]<72&&!flag){
                System.out.print(days[s1[i]-'A']+" ");
                flag=true;
                continue;
            }
            if(flag&&s1[i]==s2[i]){
                if(s1[i]>='0'&&s1[i]<='9'){
                    System.out.print("0"+(s1[i]-'0')+":");
                    break;

                }
                else if(s1[i]>='A'&&s1[i]<='N'){
                    System.out.print(s1[i]-'A'+10+":");
                    break;
                }
            }
        }
        for(int i =0;i<s3.length;i++){
            if(s3[i]==s4[i]&&s3[i]>='A'&&s3[i]<='z'){
                if(i<=9){
                    System.out.print("0"+i);
                    break;
                }
                else{
                    System.out.print(i);
                    break;
                }
            }
        }

    }
}