package main.pat.day1.title1015;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Main{



    private static class Person implements Comparable<Person>{
        private int id;
        private int mora;
        private int talent;
        private int type;
        private int socre;

        public Person(int id, int mora, int talent,int h) {
            this.id = id;
            this.mora = mora;
            this.talent = talent;
            this.socre=this.mora+this.talent;

            if (mora >= h && talent >= h) {
                type=1;
            }
            if (mora >= h && talent < h) {
                type=2;
            }
            if (mora < h && mora < h) {
                type=3;
            }
            else{
                type=4;
            }
        }

        public void printInfo() {
            System.out.println(this.id+" "+this.mora+" "+this.talent);
        }

        @Override
        public int compareTo( Person t1) {
            if (this.type == t1.type) {
                if (this.socre == t1.socre) {
                    if (this.mora == t1.mora) {
                        return this.id-t1.id;
                    }
                    return t1.mora-this.mora;
                }
                return t1.socre-this.socre;
            }
            return this.type-t1.type;

        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int L = Integer.parseInt(s[1]);
        int H = Integer.parseInt(s[2]);
        List<Person> plist = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] s2=br.readLine().split(" ");
            int id = Integer.parseInt(s2[0]);
            int mora = Integer.parseInt(s2[1]);
            int talent = Integer.parseInt(s2[2]);
            Person person = new Person(id, mora, talent, H);
            if (mora >= L && talent >= L) {
                plist.add(person);
            }
        }
        System.out.println(plist.size());
        Collections.sort(plist);
        for (Person person : plist) {
            person.printInfo();
        }

    }

}