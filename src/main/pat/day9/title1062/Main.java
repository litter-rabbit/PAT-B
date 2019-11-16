package main.pat.day9.title1062;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] s1=s[0].split("/");
        String[] s2=s[1].split("/");
        int a1=Integer.parseInt(s1[0]);
        int b1 = Integer.parseInt(s1[1]);
        int a2 = Integer.parseInt(s2[0]);
        int b2 = Integer.parseInt(s2[1]);

        if(a2*b1<a1*b2){
            int temp=a1;
            a1=a2;
            a2=temp;
            temp=b1;
            b1=b2;
            b2=temp;
        }
        
        
        int k = Integer.parseInt(s[2]);
        
        int flag=0;
        int num=1;
        while(num*b1<=k*a1){num++;}
        
        for(int i=num;i<k;i++){
            if(sample(i,k)==1){
                if(valid(i,k,a1,b1,a2,b2)){
                    if(flag==1){
                        System.out.print(" "+i+"/"+k);
                    }
                    else{
                        System.out.print(i+"/"+k);
                        flag=1;

                    }
                    
                }
            }
            
        }

    }

    public static int sample(int a,int b){

        return b==0?a:sample(b,a%b);

    }
    
    public static boolean valid(int i,int k,int a1,int b1,int a2,int b2){
        
        if((i*b1>a1*k)&&(i*b2<a2*k)){
            return true;
        }else{
            return false;
        }
    }
}
