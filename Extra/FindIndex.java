package Extra;

public class FindIndex {
    public static void main(String[] args) {
        int arr[]= {10,20,30,10,35,40};
        int target=10;
       indexof(arr,target);
    }

    public static void indexof(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println(i);
            }
        }
    }
}
