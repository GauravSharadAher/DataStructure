package DSDay1;

import java.util.Scanner;

public class ThirdLargestinArray {

    public void thirdLargest(int arr[]){
        if(arr.length<3){
            System.out.println("Array size is small");
        }else{
        int l1=0;
        int l2=0;
        int l3=0;
        for(int i=0; i<arr.length; i++){
           if(l1<arr[i]){
               l3=l2;
               l2=l1;
               l1=arr[i];
                         }
           else if(l2<arr[i]) {
               l3 = l2;
               l2 = arr[i];
           }
           else if(l3<arr[i]){
               l3=arr[i];
           }
           }

       System.out.println("Third largest element in an array"+l3);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements");
        for (int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        ThirdLargestinArray t= new ThirdLargestinArray();
        t.thirdLargest(arr);

    }
}
