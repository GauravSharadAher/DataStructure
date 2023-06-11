package BinarySearch;
// CHECK AGAN FOR DUPLICATES
//LEETCODE QUESTION
public class SortedRoatatedBS {
    public static void main(String[] args) {
        int [] arr ={3,4,5,6,7,0,1,2};
//        int [] arr = {2,9,2,2,2};
        int target = 2;
        System.out.println(search(arr,target));
        System.out.println(FindPivotDuplicate(arr));

    }

    static int search(int [] arr ,int target){
        int pivot = FindPivotDuplicate(arr);

        if(pivot==-1){
            return BinarySearch(arr,target,0, arr.length-1);
        }
        if(arr[pivot]==target){
            return  pivot;
        }
        if(target>=arr[0]){
            return BinarySearch(arr,target,0,pivot-1);
        }
        return BinarySearch(arr,target,pivot+1,arr.length-1);
    }


    static int FindPivot(int []arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid =(start+(end-start)/2);
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end = mid -1;
            }else {
                start = mid+1;
            }
        }return -1;
    }

    static int FindPivotDuplicate(int []arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid =(start+(end-start)/2);
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
                //if element at start ,mid, end are equal then  we can skip duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip th duplicates

                //what if the start/end element is pivot element? , we cant ignore before checking if start is pivot or not
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end-1]>arr[end]){
                    return end-1;
                }
                end--;
            }
            // left side is  sorted so pivot mst be in right
            else if (arr[start]<arr[mid] || (arr[start]==arr[mid]) && arr[end]>arr[mid]) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }return -1;
    }

    static int BinarySearch(int [] arr , int target ,int start , int end){
        while(start<=end){
            int mid = (start+(end-start)/2);
            if(target<arr[mid]){
                end = mid-1;
            } else if (target >arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
