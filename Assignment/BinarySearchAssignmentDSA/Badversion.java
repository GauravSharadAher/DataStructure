package BinarySearchAssignmentDSA;

import java.util.Scanner;

public class Badversion {
    public static void main(String[] args) {
        int num = 5;
        int target = 4;
        badVersion(num,target);
        System.out.println(Binary(num,target) + " is the first bad version ");

    }

    static void badVersion(int num,int target){
        int ans = Binary(num,target);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number between 1-10");
        int check =in.nextInt();
        if(check>=ans){
            System.out.println("Badversion " + check);
            //return true;
        }else {
            System.out.println("Goodversion " +check);
            //return  false;
        }
    }

    static int Binary(int num, int target){
        int start =0;
        int end = num;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid==target){
                return mid;
            } else if (mid>target) {
                end= mid-1;
            }else {
                start=mid+1;
            }

        }return -1;
    }
}
