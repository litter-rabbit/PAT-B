package main.pat.day10.title1071;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int total = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String[] game;
        for(int i=0;i<k;i++){
            game=br.readLine().split(" ");
            int n1 = Integer.parseInt(game[0]);
            int b = Integer.parseInt(game[1]);
            int t = Integer.parseInt(game[2]);
            int n2 = Integer.parseInt(game[3]);
            if(t>total){
                System.out.println("Not enough tokens.  Total = "+total+".");
                continue;
            }
            if(n1>n2){
                if(b==0){
                    total+=t;
                    System.out.println("Win "+t+"!  Total = "+total+".");
                }
                else{
                    total-=t;
                    System.out.println("Lose "+t+".  Total = "+total+".");
                    if(total<=0){
                        System.out.println("Game Over.");
                        break;
                    }

                }
            }
            else{
                if(b==1){
                    total+=t;
                    System.out.println("Win "+t+"!  Total = "+total+".");
                }
                else{
                    total-=t;
                    System.out.println("Lose "+t+".  Total = "+total+".");
                    if(total<=0){
                        System.out.println("Game Over.");
                        break;
                    }

                }
            }
        }


    }
}
