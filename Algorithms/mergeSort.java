package Algorithms;

public class mergeSort {

        public static void sort(int[] arr, int l, int h) {
            if(l<h)
            {
                int mid=(l+h)/2;
                sort(arr,l,mid);
                sort(arr,mid+1,h);
                merge(arr,l,mid,h);
            }

        }

        public static void merge(int[] arr, int l, int mid, int h) {
            int n1=mid-l+1;
            int n2=Math.abs(mid-h);

            int[] a1=new int[n1];
            int[] a2=new int[n2];

            for(int i=0;i<n1;i++)
            {
                a1[i]=arr[l+i];
            }

            for(int i=0;i<n2;i++)
            {
                a2[i]=arr[mid+1+i];
            }

            int i=0,j=0,k=l;
            while(i<n1 && j<n2)
            {
                if(a1[i]>a2[j])
                {
                    arr[k++]=a2[j++];
                }
                else
                {
                    arr[k++]=a1[i++];
                }
            }

            while(i<n1)
            {
                arr[k++]=a1[i++];
            }
            while(j<n2)
            {
                arr[k++]=a2[j++];
            }

        }

        public void display(int[] arr) {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+"\t");
            }

        }





}
