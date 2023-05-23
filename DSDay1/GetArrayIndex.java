package DSDay1;

import java.util.Scanner;

public class GetArrayIndex {

    public void getIndex(int arr [], int ele){
        int index=-1;
        int i;
        for(i=0; i<arr.length;i++ ){
            if(arr[i]==ele){
                index=i;
                break;
            }
        }
        if(i==arr.length && index==-1){
            System.out.println("Element does not found");
        }
        else{
            System.out.println("Element found at index: "+index);
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
        System.out.println("Enter the element to get the index");
        int ele=sc.nextInt();
        GetArrayIndex g= new GetArrayIndex();
        g.getIndex(arr,ele);
    }
}
