package main.pat.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[]{4, 5, 7, 3, 2, 1,6};



        //insertSort(a);
        //slectSort(a);
        //changeSort(a);
       // mergeSort(a,0,a.length-1);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }


    }

    public static void insertSort(int[] a) {
        for(int i=1;i<a.length;i++){

            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }

    }

    public static void mergeSort(int[] a,int L,int R) {
        if(L==R){
            return;
        }
        else{
            int m=(L+R)/2;
            mergeSort(a, L, m);
            mergeSort(a,m+1,R);
            merge(a,L,m+1,R);
        }

    }

    public static void merge(int[] a,int l,int m,int r){
        int[] leftarray = new int[m - l];
        int[] rightarray = new int[r - m + 1];

        for(int i=l;i<m;i++){
            leftarray[i-l] = a[i];
        }
        for(int i=m;i<=r;i++){
            rightarray[i-m] = a[i];
        }

        int i=0,j=0;
        int k=l;

        while (i < m - l && j < r - m + 1) {
            if (leftarray[i] < rightarray[j]) {
                a[k] = leftarray[i];
                        i++;
                        k++;
            }
            else{
                a[k] = rightarray[j];
                j++;
                k++;
            }
        }
        while (i < m - l) {
            a[k++] = leftarray[i++];
        }
        while (j < rightarray.length) {
            a[k++] = rightarray[j++];
        }


    }

    public static void slectSort(int[] a) {
        for(int i=0;i<a.length;i++){
            int minindex=i;
            int minvalue=a[i];

            for(int j=i+1;j<a.length;j++){
                if(a[j]<minvalue){
                    minindex=j;
                    minvalue = a[j];
                }
            }
            int temp=a[i];
            a[i]=a[minindex];
            a[minindex]=temp;
        }

    }

    public static void  changeSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>i;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j] = a[j - 1];
                    a[j-1]=temp;
                }
            }

        }


    }






}
