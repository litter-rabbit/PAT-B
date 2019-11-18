package main.pat.day11.title1072;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        String[] checked = br.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<checked.length;i++){
            map.put(checked[i], 1);
        }
        String[] temp;
        int count=0;
        int goods=0;
        for(int i=0;i<n;i++){
            temp = br.readLine().split(" " );
            int flag=0;
            int flag1=0;
            for(int j=2;j<temp.length;j++){
                if(map.containsKey(temp[j])){
                    if(flag==1){
                        System.out.print(" "+temp[j]);
                        goods++;
                    }
                    else{
                        System.out.print(temp[0] + ": " + temp[j]);
                        flag=1;
                        flag1=1;
                        goods++;
                    }
                }
            }
            System.out.println();
            if(flag1==1){
                count++;
            }
        }

        System.out.print(count+" "+goods);

    }
}
