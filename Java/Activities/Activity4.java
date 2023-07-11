package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int arr[] = {98,11,45,9,22,61,18,-2};
        insertionSortFunction(arr);
        System.out.println("sorted array:"+ Arrays.toString(arr));
    }

    public static void insertionSortFunction(int x[]){
        int len = x.length;

        for (int i=0;i<len;i++){
            int val = x[i];
            int j=i-1;

            for(;j>=0 && val<x[j];j--){
                x[j+1]=x[j];
            }
            x[j+1]=val;

        }

    }
}
