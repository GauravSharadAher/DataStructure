package Extra;

public class Subarr {
    public static void main(String[] args) {
        int [] arr={-5,1,7,8,9,2,11,15};
        int ans=len(arr);
        System.out.println(ans);

    }
    public static int len(int arr[]){
        int max_count=1;
        int save=max_count;
        if(arr.length<1){
            max_count=0;
            return max_count;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] > arr[i]) {
                max_count++;
            } else {
                save=max_count;
                max_count = 1;
            }

    }
        return save;
    }
}
