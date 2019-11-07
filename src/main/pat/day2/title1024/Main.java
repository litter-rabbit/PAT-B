package main.pat.day2.title1024;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split("E");
        int n = Integer.parseInt(s[1]);
        if(s[0].charAt(0)=='-'){
            System.out.print('-');

        }
        s[0] = s[0].substring(1);

        if(n<0){
            System.out.print("0.");
            for(int i=0;i<Math.abs(n)-1;i++){
                System.out.print("0");
            }
            for(int i=0;i<s[0].length();i++){
                if(s[0].charAt(i)!='.'){
                    System.out.print(s[0].charAt(i));
                }
            }
        }
        else{

            System.out.print(s[0].charAt(0));
            int cnt=0;
            int j;
            for(j=2;j<s[0].length()&&cnt<n;j++,cnt++){
                System.out.print(s[0].charAt(j));
            }
            if(j==s[0].length()){
                for(int k=0;k<n-cnt;k++){
                    System.out.print("0");

                }
            }
            else{
                System.out.print(".");
                for(int k=j;k<s[0].length();k++){
                    System.out.print(s[0].charAt(k));
                }
            }
        }
    }

}
