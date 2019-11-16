package main.pat.day8.title1059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> sort = new HashMap<>();
        for(int i=0;i<n;i++){
            String temp = br.readLine();
            sort.put(temp,i+1);
        }
        int[] checked = new int[10000];
        int k = Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++){
            String temp2=br.readLine();
            if (sort.containsKey(temp2)) {
                int index=sort.get(temp2);
                if(checked[index]==0){
                    if(index==1){
                        System.out.println(temp2+": "+"Mystery Award");
                    } else if (isprimer(index)) {
                        System.out.println(temp2+": "+"Minion");
                    }
                    else{
                        System.out.println(temp2+": "+"Chocolate");
                    }
                    checked[index]=1;
                }
                else{
                    System.out.println(temp2+": "+"Checked");
                }
            }
            else{
                System.out.println(temp2+": "+"Are you kidding?");
            }
        }
    }

    public static boolean isprimer(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
