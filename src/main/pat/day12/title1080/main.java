package main.pat.day12.title1080;

import main.pat.day5.title1041.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {


    public static class Student implements Comparable<Student>{

        private String num;
        private int gp;
        private int gmid;
        private int gf;
        private int g;

        public int getG() {
            return g;
        }

        public void setG(int g) {
            this.g = g;
        }

        public Student() {

        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public int getGp() {
            return gp;
        }

        public void setGp(int gp) {
            this.gp = gp;
        }

        public int getGmid() {
            return gmid;
        }

        public void setGmid(int gmid) {
            this.gmid = gmid;
        }

        public int getGf() {
            return gf;
        }

        public void setGf(int gf) {
            this.gf = gf;
        }

        @Override
        public int compareTo(Student s) {
            if (s.g > this.g) {
                return 1;
            } else if (s.g == this.g) {
                return this.num.compareTo(s.num);

            }
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int p =Integer.parseInt(s[0]);
        int m =Integer.parseInt(s[1]);
        int n =Integer.parseInt(s[2]);

        Map<String,Student> stu = new HashMap<>();
        int gp;
        for(int i=0;i<p;i++) {
            s = br.readLine().split(" ");
            String num = s[0];
            gp = Integer.parseInt(s[1]);
            if (gp >= 200) {
                Student student = new Student();
                student.setGp(gp);
                stu.put(num, student);
                stu.get(num).setNum(num);
            }

        }
        int gmid;
        for(int i=0;i<m;i++){
            s=br.readLine().split(" ");
            String num = s[0];
            gmid = Integer.parseInt(s[1]);
            if (stu.containsKey(num)) {
                stu.get(num).setGmid(gmid);
            }

        }
        int gf;
        for(int i=0;i<n;i++){
            s=br.readLine().split(" ");
            String num = s[0];
            gf = Integer.parseInt(s[1]);
            if (stu.containsKey(num)) {
                stu.get(num).setGmid(gf);
            }

        }
        List<Student> resutl = new ArrayList<>();

        Set<String> keys= stu.keySet();
        for (String key : keys) {
            Student stemp = stu.get(key);
            if (stemp.gf > stemp.gmid) {
                stemp.setG(stemp.gf);
            }else{
                stemp.setG((int) Math.round(0.4 * stemp.gmid + 0.6 * stemp.gf));
            }

            if(stemp.g>=60){
                resutl.add(stemp);
            }
        }
        Collections.sort(resutl);

        for(int i=0;i<resutl.size();i++){
            Student s2 = resutl.get(i);
            System.out.println(s2.num + " " + s2.gp + " " + s2.gmid + " " + s2.gf + " " + s2.g);
        }

    }

}
