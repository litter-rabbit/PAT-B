package main.pat.day11.title1077;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);

        int socre = Integer.parseInt(s[1]);

        for(int i=0;i<n;i++){
            String[] temp = br.readLine().split(" ");
            int teacher = Integer.parseInt(temp[0]);
            float sum=0;
            int count=0;
            float max=-1;
            float min=socre+1;
            for(int j=1;j<temp.length;j++){
                int student = Integer.parseInt(temp[j]);
                if (student >= 0 && student <= socre) {
                    if(student>max){
                        max=student;
                    }
                    if(student<min){
                        min=student;
                    }
                    sum+=student;
                    count++;
                }
            }
            count-=2;
            sum=sum-max-min;
            float res = (teacher+sum/count)/2;
            System.out.println(Math.round(res));
        }


    }
}
