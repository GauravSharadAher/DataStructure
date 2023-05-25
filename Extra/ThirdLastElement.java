package Extra;

public class ThirdLastElement
{
    public static void main(String[] args) {
        int [] arr={10,30,20,50,25};
        int ans = tHigh(arr);
        System.out.println(ans);
    }

    public static int  tHigh(int[] arr){
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        int m3=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>m1){
                int temp=m1;
                int temp2=m2;
                m1=arr[i];
                m2=temp;
                m3=temp2;

            } else if (arr[i]<m1) {
                int temp=m2;
                m3=temp;
            }
            else if(arr[i]<m2){
                m3=arr[i];
            }

        }

        return   m3;
    }
}
