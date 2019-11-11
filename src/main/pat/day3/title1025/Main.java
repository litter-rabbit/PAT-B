package main.pat.day3.title1025;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;


//有一个测试点没有ac

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = in.readLine().split(" ");

        int first = Integer.parseInt(s1[0]);
        int n = Integer.parseInt(s1[1]);
        int k = Integer.parseInt(s1[2]);

        int[] data = new int[100005];
        int[] next = new int[100005];

        for(int i=0;i<n;i++){
            String[]  s2=in.readLine().split(" ");
            int temp = Integer.parseInt(s2[0]);
            data[temp] = Integer.parseInt(s2[1]);
            next[temp] = Integer.parseInt(s2[2]);
        }

        int[] list = new int[100005];
        int sum=0;
        while(first!=-1){
            list[sum++]=first;
            first = next[first];
        }

        for(int i=0;i<sum-sum%k;i+=k){
            reverse(list,i,i+k-1);
        }

        for(int i=0;i<sum-1;i++){
            System.out.printf("%05d %d %05d\n", list[i], data[list[i]], list[i + 1]);
        }
        System.out.printf("%05d %d -1", list[sum - 1], data[list[sum - 1]]);


    }

    public static void reverse(int[] list,int begin,int last){
        while(begin<last){
            int temp=list[begin];
            list[begin]=list[last];
            list[last]=temp;
            begin++;
            last--;
        }


    }

}
