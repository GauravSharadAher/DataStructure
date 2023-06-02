package Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={10,5,18,20,2,98,11};
        bubble(arr);
    }
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag= false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
