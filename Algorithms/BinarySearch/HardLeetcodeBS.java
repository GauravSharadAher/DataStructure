package BinarySearch;
// check the approch and why we used Binary search , array is not sorted
public class HardLeetcodeBS {
    public static void main(String[] args) {
        int arr[] ={7,2,5,8,10};
        int m =2;
        System.out.println(splitarray(arr,m));
    }

    static int splitarray(int [] arr , int m){
        int start =0;
        int end=0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]);// will have have value max in the array i.e 10
            end = end+arr[i];// whole arr value i.e 7+5+2+8+10=32
        }

        // apply binary search
        while(start<end){
            //try for the middle as potential ans
            int mid = start+(end-start)/2;
            //10+32/2=21 then mid = 21 and start using binary in this range
            //cal how many piece we can divide in with this max sum
            //if the pieces gets completed before 2 split i.e  1 piece  then we need to decrease the value of  end = mid
            //if the piece  exceeds more than 2 then we need to increase the mid value then start = start +1
            int sum =0;
            int pieces=1;
            for(int num:arr){
                if (sum+num>mid){
                    //cannot add in this sub array i.e exceed the value so create new array
                    //say u can add this number in sub array i.e sum=num\
                    sum = num;
                    pieces++;
                }else {
                    sum = sum+num;
                }
            }
            if(pieces>m){
                start =mid+1;
            }else {
                end= mid;
            }
        }
        return start;
    }





}
