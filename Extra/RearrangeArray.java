package Extra;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr ={-22,9,11,12,13,41};
        System.out.println("Before Swapping :" + Arrays.toString(arr));
        int [] ans=arrange(arr);
        System.out.println("After Swapping :" + Arrays.toString(ans));
    }

    public static int[] arrange(int[] arr){
        int start=1;
        int end=arr.length-2;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        return arr;
    }
}
