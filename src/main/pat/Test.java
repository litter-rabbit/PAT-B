package main.pat;

import main.pat.faster.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        for(int i=0;i<100;i++){
            if (Math.isprimer(i)) {
                System.out.println(i);
            }
        }
    }
}
