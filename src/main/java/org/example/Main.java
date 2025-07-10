package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// This is the brute force approach to generate all sub arrays
public class Main {
    public static void main(String[] args) {
  int arr[] ={11,-5,5,6};
        generateSubarrays(arr);
    }

    static void generateSubarrays(int arr[]){

int  maxSum=0;
        for(int i=0;i<arr.length;i++){
            int currentSum = 0;
            for(int j=i;j<arr.length;j++){
               currentSum+=arr[j];

            }

          maxSum=Math.max(maxSum,currentSum);

        }
        System.out.println(maxSum);
    }
}
