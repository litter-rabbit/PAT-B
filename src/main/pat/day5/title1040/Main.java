package main.pat.day5.title1040;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int countt=0;
        for (char c : s.toCharArray()) {
            if(c=='T'){
                countt++;
            }
        }
        int countp=0;
        long res=0;
        for (char c : s.toCharArray()) {
            if(c=='P')countp++;
            if(c=='T')countt--;
            if(c=='A')res+=countp*countt;
        }

        System.out.print(res%1000000007);
    }
}
