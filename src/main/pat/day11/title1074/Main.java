package main.pat.day11.title1074;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cast  = br.readLine();
        String s1 = br.readLine();
        String s2=br.readLine();
        if(s1.length()<s2.length()){
            String temp =s1;
            s1=s2;
            s2=temp;
        }

        int len1=s1.length()-1;
        int len2=s2.length()-1;
        StringBuilder res = new StringBuilder();
        int len=cast.length()-1;
        int next=0;
        for(int i=len2;i>=0;i--){
            int n = s2.charAt(i)-'0'+s1.charAt(len1--)-'0'+next;
            int i1=cast.charAt(len--)-'0';
            if(i1!=0){
                res.append(n%i1);
                next=n/i1;
            }
            else{
                i1=10;
                res.append(n%i1);
                next=n/i1;
            }
        }

        while(len1>=0){
            int i2=cast.charAt(len--)-'0';
            if(i2!=0){
                int i3=s1.charAt(len1--)-'0'+next;
                res.append(i3%i2);
                next=i3/i2;
            }else{
                i2=10;
                int i3=s1.charAt(len1--)-'0'+next;
                res.append(i3%i2);
                next=i3/i2;
            }
        }
        if(next!=0){
            res.append(next);
        }
        int i4=0;
        String result=res.reverse().toString();
        for(int i=0;i<result.length();i++){
            if(result.charAt(i)=='0'){
                i4++;
            }
            else{
                break;
            }
        }

        if(result.length()==0){
            System.out.println("0");
        }
        else if(result.length()==1){
            System.out.println(result);
        }
        else{
            System.out.println(result.substring(i4));
        }

    }
}
