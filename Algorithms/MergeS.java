package Algorithms;

import java.util.Arrays;

public class MergeS {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2};
        mergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
//    public static void print(int []arr,int l,int h){
//        System.out.println("print array");
//        for(int i=l; i<h;i++){
//            System.out.println(arr[i]+"\t");
//        }
//    }

// Method1 : Chnage in same array object in-plane sorting
    public static void mergesort(int []arr,int start,int end){
        if(end-start==1){
            return ;
        }
        int mid= (start+end)/2;
        mergesort(arr,start,mid);
        //print(arr,start,mid);

        mergesort(arr,mid,end);
        //print(arr,mid,end);

        merge1(arr,start ,mid,end);
    }

    private static void merge1(int[] arr,int start,int mid,int end ) {
        int [] mix= new int[end-start];

        int i=start;
        int j=mid;
        int k=0;
        while(i < mid && j < end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
            /* here we check that if the first or second array end first
        then remaining elements of array gets added to new array
         */
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }
        //
        for (int l = 0; l < mix.length; l++) {
            arr[start+l]=mix[l];
        }
    }


    //Method 2:
    // merge sort via passing a new object using Arrays.copyofRange()


    // create left irght array and pass to merge(left,right)
    private static int[] merge2(int[] first, int[] second) {
        int [] mix= new int[first.length+ second.length];

        int i=0;
        int j=0;
        int k=0;
        while(i < first.length && j < second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
            /* here we check that if the first or second array end first
        then remaining elements of array gets added to new array
         */
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }

        return mix;
    }

}
