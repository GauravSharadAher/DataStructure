package Extra;

import java.util.Arrays;
//
public class Plusone {
    public static void main(String[] args) {
        int arr[] = {1, 3};
        int arr1[] = {2, 5,6};
        int arr2[] = new int[arr.length + arr1.length];
        int end = arr.length;
        float ans=0;
        int ans2=0;


        for (int i = 0; i < arr2.length; i++) {
            if (i <= arr.length - 1) {
                arr2[i] = arr[i];
            } else {
                arr2[i] = arr1[i - end];
            }
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int mid=arr2.length/2;

        if(arr2.length%2==0){
            ans=(float)(arr2[mid]+arr2[mid-1])/2;
            System.out.println(ans);
        }else{
            ans=(int)(arr[mid-1]);
            ans2=(int)(ans);
            System.out.println(ans2);

        }


    }
    }



