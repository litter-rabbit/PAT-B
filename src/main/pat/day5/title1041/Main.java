package main.pat.day5.title1041;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        student[] students = new student[1000];
        int len=0;
        for(int i=0;i<n;i++){
            String[] s=br.readLine().split(" ");
            students[len++] = new student(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]));

        }
        int m = Integer.parseInt(br.readLine());
        String[] checked= br.readLine().split(" ");
        for(int i=0;i<m;i++){
            for(int j=0;j<students.length;j++){
                if (Integer.parseInt(checked[i]) == students[j].test) {
                    System.out.println(students[j].id+" "+students[j].exam);
                    break;
                }
            }
        }

    }


    public static class student{

        private String id;
        private int test;
        private int exam;

        public student(String id, int test, int exam) {
            this.id = id;
            this.test = test;
            this.exam = exam;
        }
    }
}
