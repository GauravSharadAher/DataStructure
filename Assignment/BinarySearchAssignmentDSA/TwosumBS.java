package BinarySearchAssignmentDSA;

import java.util.Arrays;

public class TwosumBS {
    public static void main(String[] args) {
        int target =5;
        int[] arr =BinaryTwosum(new int[]{1,2,3,4,5},target);
//        System.out.println(Arrays.toString(BinaryTwosum(arr, target)));
        System.out.println(Arrays.toString(arr));
    }

    static int [] BinaryTwosum(int []arr , int target){
        for (int i = 0; i < arr.length; i++) {
            int start =i+1;
            int end= arr.length-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid] == target -arr[i]){
                     return new int []{i+1,mid+1};
                } else if (arr[mid]>target-arr[i]) {
                    end= mid-1;
                }else {
                    start =mid+1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
