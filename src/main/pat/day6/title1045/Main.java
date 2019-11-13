package main.pat.day6.title1045;

import javax.print.DocFlavor;
import java.io.BufferedReader;

import java.io.*;
import java.sql.BatchUpdateException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        node[] a = new node[n];
        String[] s=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            a[i] = new node(Integer.parseInt(s[i]), i);
        }
        Arrays.sort(a);
        int[] res = new int[n];
        int len=0;
        for(int i=0;i<a.length;i++){
            if (a[i].index == i) {
                res[len++]=a[i].value;
            }
        }
        int flag=0;
        System.out.println(len);
        for(int i=0;i<len;i++)
        {
            if (flag == 1) {
                System.out.print(" "+res[i]);
            }
            else{
                System.out.print(res[i]);
                flag=1;
            }
        }
    }
    public static  class node implements Comparable<node>{
        private int value;
        private int index;
        public node(int value, int index) {
            this.value=value;
            this.index=index;
        }

        @Override
        public int compareTo(node node) {
            return this.value-node.value;
        }
    }


}
