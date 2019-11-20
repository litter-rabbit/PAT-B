package main.pat.day13.title1087;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();

        int temp;
        for(int i=1;i<=n;i++){
            temp=i/2+i/3+i/5;
            set.add(temp);
        }

        System.out.println(set.size());


    }
}
