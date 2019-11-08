package main.pat.day3.title1028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static class Person implements Comparable<Person>{
        String name;
        private int year;
        private int month;
        private int days;

        public Person(String name, int year, int month, int days) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.days = days;
        }

        @Override
        public int compareTo(Person person) {
            if(person.year!=this.year){
                return this.year-person.year;
            }
            else{
                if(person.month!=this.month){
                    return this.year-person.year;
                }
                else{
                    return this.days-person.days;
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] s = br.readLine().split(" ");
            String name = s[0];
            String[] s1=s[1].split("/");
            int year = Integer.parseInt(s1[0]);
            int month = Integer.parseInt(s1[1]);
            int day = Integer.parseInt(s1[2]);
            if (isvalid(year,month,day)) {

                list.add(new Person(name, year, month, day));
            }
        }
        Collections.sort(list);

        System.out.print(list.size()+" "+list.get(0).name+" "+list.get(list.size()-1).name);
    }

    public static boolean isvalid(int year,int month,int day){

        if(year<1814||year>2014){
            return false;
        }
        if(year==1814){
            if(month<9)return false;
            if(month==9){
                if(day<6)return false;
            }
        }
      if(year==2014){
          if(month>9)return false;
          if(month==9){
              if(day>6){
                  return false;
              }
          }
      }
      return true;
    }

}
