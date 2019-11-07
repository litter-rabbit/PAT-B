package main.pat.day2.title1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

     static class  price implements Comparable<price>{
        public price(int store, double price) {
            this.store = store;
            this.price = price;
        }
        int store;
        double price;
         @Override
         public int compareTo(Main.price t1) {
             if (t1.price >this.price ) {
                 return 1;
             }
             if (t1.price < this.price) {
                 return -1;
             }
             return 0;
         }
     }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int needsotore = Integer.parseInt(s[1]);
        String[] s1 = br.readLine().split(" ");
        List<Integer> store = new ArrayList<>();
        for(int i=0;i<n;i++){
            store.add(Integer.parseInt(s1[i]));
        }
        String[] s2 = br.readLine().split(" ");
        List<Double> profit = new ArrayList<>();

        for(int i=0;i<n;i++){
            profit.add(Double.parseDouble(s2[i]));
        }
        List<price> prices = new ArrayList<>();
        for(int i=0;i<n;i++){
            prices.add(i,new price(store.get(i),profit.get(i)/store.get(i)));
        }
        Collections.sort(prices);

        double result=0;

        for(int begin=0;begin<prices.size();begin++){
            if (needsotore >= prices.get(begin).store) {
                result+=prices.get(begin).store*prices.get(begin).price;
                needsotore-=prices.get(begin).store;
            }
            else{
                result+=prices.get(begin).price*needsotore;
                break;
            }
        }

        System.out.printf("%.2f", result);


    }
}
