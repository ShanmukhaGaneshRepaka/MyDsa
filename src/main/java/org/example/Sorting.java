package org.example;

import java.util.Arrays;

public class Sorting {
    static int[] insertionSort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];

            int j=i-1;

            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }

       // System.out.println(Arrays.toString(arr));
    return arr;
    }

    static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j && arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        return arr;
    }

    static int[] selectionSort(int arr[]){
        int n=arr.length-1;
        for (int i = 0; i <arr.length ; i++) {
            int max=findMax(arr, 0, n-i);

            int temp=arr[max];
            arr[max]=arr[n-i];
            arr[n-i]=temp;


        }
return arr;
    }

    static int findMax(int[] arr,int s,int e){
        int max=s;
        for (int i = s; i <=e ; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
    return max;
    }
    public static void main(String[] args) {
        int[] arr={3,8,1,6,4,0,2};
        System.out.println(Arrays.toString(selectionSort(arr)));


    }
}
