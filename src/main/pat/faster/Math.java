package main.pat.faster;

public class Math {

    private static double sqrt_f=1e-7;
    private static Object NumberFormatException;
    public static double sqrt(double x){
        if(x<0){
            return -1;
        }
        return _sqrt(x,(Double.MAX_VALUE+x/Double.MAX_VALUE)/2,Double.MAX_VALUE);
    }

    public static double _sqrt(double x,double s,double t){
        if (java.lang.Math.abs(s - t) < sqrt_f) {
            return s;
        }
        t=(s+x/s)/2;
        return _sqrt(x,t,s);
    }


    public static boolean isprimer(int i){
        if(i<2){
            return false;
        }
        if(i==2||i==3){
            return true;
        }
        if(!(i%6==1||i%6==5)){
            return false;
        }
        double temp = Math.sqrt(i);
        for(int j=5;j<=temp;j+=6){
            if(i%j==0||i%(j+2)==0){
                return false;
            }
        }

        return true;

    }


}
