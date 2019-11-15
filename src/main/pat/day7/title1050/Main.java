package main.pat.day7.title1050;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s= br.readLine().split(" ");
        for(int i=0;i<s.length-1;i++){
            int maxindex=i;
            int maxvalue = Integer.parseInt(s[i]);
            for(int j=i+1;j<s.length;j++){
                int temp=Integer.parseInt(s[j]);
                if(temp>maxvalue) {
                    maxindex=j;
                    maxvalue=temp;
                }
                String tempstring = s[i];
                s[i] = s[maxindex];
                s[maxindex]=tempstring;
            }
        }
        int m=1;
        int min=1000000;
        for(int i=1;i<=N;i++){
            int i1=N/i;
            if(i1*i==N && i >= i1){
                if ((i - i1) < min) {
                    min=(i-i1);
                    m=i;
                }
            }
        }
        int n =(N+1)/m;
        int[][] res = new int[m][n];
        int top=0;
        int right=n-1;
        int bottom=m-1;
        int left=0;
        int len=0;
        while(len<s.length){
            for(int i=left;i<=right;i++){
                res[top][i] = Integer.parseInt(s[len++]);
            }

            for(int i=top;i<=bottom;i++){
                res[i][right] = Integer.parseInt(s[len++]);
            }

            for(int i=right;i>=left;i--){
                res[bottom][i]=Integer.parseInt(s[len++]);
            }

            for(int i=bottom;i>=top;i--){
                res[i][left]=Integer.parseInt(s[len++]);
            }
            if(left<=right){
                left++;
                right--;
            }
           if(top<=bottom){
               top++;
               bottom--;
           }
        }

        for(int i=0;i<m;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(flag==1){
                    System.out.print(" "+res[m][n]);
                }
                else{
                    System.out.print(res[m][n]);
                    flag=1;
                }
            }
            System.out.println();

        }
    }
}
