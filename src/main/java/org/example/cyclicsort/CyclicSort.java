package org.example.cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,4,4,3,6,2};
        sort(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){

        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;

            if(arr[i]<arr.length&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                System.out.println("Duplicate element is "+arr[j]);

            }
        }

    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
