import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public String getOptimal(int[] array,int winByC,int winByJ,int winByB){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        String optimalChoice=null;
        if(array[2]>array[1]){
            if(array[2]==winByC){
                optimalChoice="C";
            }
            if(array[2]==winByJ){
                optimalChoice="J";
            }
            if(array[2]==winByB){
                optimalChoice="B";
            }
        }
        else{
            if(array[2]==array[1]&&array[1]==array[0]){
                optimalChoice ="B";
            }
            else{
                if(array[0]==winByC){
                    optimalChoice="B";
                }
                if(array[0]==winByJ){
                    optimalChoice="B";
                }
                if(array[0]==winByB){
                    optimalChoice="C";
                }
            }
        }
        return optimalChoice;
    }

    public static  void main(String[] arg){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        int n=0;
        try {
            n = Integer.valueOf(br.readLine());
        } catch (NumberFormatException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        int win_jia =0;//即乙输的次数
        int draw_jia=0;//即乙平的次数
        int lose_jia=0;//即乙赢的次数

        int winByC_jia=0;
        int winByJ_jia=0;
        int winByB_jia=0;

        int winByC_yi=0;
        int winByJ_yi=0;
        int winByB_yi=0;

        char[] arr =null;
        for(int i=0 ;i<n ;i++){




            try {
                arr=br.readLine().toCharArray();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(arr[0]=='C'&&arr[2]=='J'){
                winByC_jia++;
            }
            if(arr[0]=='J'&&arr[2]=='B'){
                winByJ_jia++;
            }
            if(arr[0]=='B'&&arr[2]=='C'){
                winByB_jia++;
            }
            if(arr[0]==arr[2]){
                draw_jia++;
            }
            if(arr[2]=='C'&&arr[0]=='J'){
                winByC_yi++;
            }
            if(arr[2]=='J'&&arr[0]=='B'){
                winByJ_yi++;
            }
            if(arr[2]=='B'&&arr[0]=='C'){
                winByB_yi++;
            }
        }
        win_jia =winByC_jia+winByJ_jia+winByB_jia;
        lose_jia=winByC_yi+winByJ_yi+winByB_yi;
        Main test =new Main();
        int[] array1 =new int[3];
        array1[0]=winByC_jia;array1[1]=winByJ_jia;array1[2]=winByB_jia;
        String optimalChoice_jia=test.getOptimal(array1, winByC_jia, winByJ_jia, winByB_jia);
        array1[0]=winByC_yi;array1[1]=winByJ_yi;array1[2]=winByB_yi;
        String optimalChoice_yi=test.getOptimal(array1, winByC_yi, winByJ_yi, winByB_yi);
        System.out.println(win_jia+" "+draw_jia+" "+lose_jia);
        System.out.println(lose_jia+" "+draw_jia+" "+win_jia);
        System.out.print(optimalChoice_jia+" "+optimalChoice_yi);

    }
}