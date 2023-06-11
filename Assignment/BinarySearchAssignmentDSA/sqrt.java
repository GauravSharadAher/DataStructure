package BinarySearchAssignmentDSA;

public class sqrt {
    public static void main(String[] args) {
        int x= 9;
        System.out.println(Binary(x));
    }

    static int Binary(int x){
        int a=1;
        int b= x;
        while(a<=b){
            int mid = a+(b-a)/2;
            if(x/mid==mid){
                return mid;
            } else if (mid>x/mid) {
                b=mid-1;
            }else {
                a= mid+1;
            }
        }
        return b;
    }
}
