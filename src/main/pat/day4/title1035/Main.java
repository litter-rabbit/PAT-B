package main.pat.day4.title1035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] s= br.readLine().split(" ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        String[] s1= br.readLine().split(" ");
        int target[] = new int[n];
        for(int i=0;i<n;i++){
            target[i] = Integer.parseInt(s1[i]);
        }
        int temparr[] =arr.clone();
        int flag=0;
        int flag1=0;
        int flag2=0;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if (temparr[j] < temparr[j - 1]) {
                    int temp=temparr[j];
                    temparr[j] = temparr[j - 1];
                    temparr[j-1]=temp;
                }
                if(flag==1){
                    for(int k=0;k<temparr.length;k++){
                        if(flag1==1){
                            System.out.print(" "+temparr[k]);
                        }
                        else{
                            System.out.print(temparr[k]);
                            flag1=1;
                        }
                    }
                    System.exit(0);
                }
                if (equals(temparr, target)) {
                        flag=1;
                }
            }
        }
    }
    public static boolean equals(int[] a, int[] b) {
        return true;
    }

}
