package main.pat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(2, 3);
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }


    }
}
