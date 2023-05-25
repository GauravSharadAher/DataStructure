package Extra;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int arr[]={9};
        int l= arr.length;

        int index=arr.length-1;
        if(arr.length==1){
            arr[0]=arr[0]+1;
            int n = arr[0];
            String s = Integer.toString(n);
            System.out.println(s);
            System.out.println(s);
            System.out.println(s.length());
            int arr1[] = new int[s.length()];
            for (int i = 0; i <arr1.length; i++) {
                String s2= String.valueOf(s.charAt(i));
                arr1[i]=Integer.parseInt(s2);
                System.out.println(Arrays.toString(arr1));
            }
//            String s2="nhj";
//            System.out.println(s2.charAt(0));
    }

}
}
