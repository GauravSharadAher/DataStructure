package Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={5,3,4,1,2};
        selection(arr);
    }
    public static void selection(int []arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[i]>max){
                    max=arr[i];
                    arr[arr.length-i]=max;
                }
            }
        }
    }
}
