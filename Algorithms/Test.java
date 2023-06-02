package Algorithms;

public class Test {
    public static void main(String[] args) {
        int[] arr= {17,2,19,55,34,5,1,29};

        int l=0;
        int h=arr.length-1;
        mergeSort ms= new mergeSort();
        System.out.println("before");
        ms.display(arr);
        ms.sort(arr,l,h);
        System.out.println("after");
        ms.display(arr);

    }


}

