package DSDay4;

public class Queue {

    public  int[] arr;

    private static final int DEFAULT_SIZE=5;


    int end=0;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.arr =  new  int[size];
    }


    public boolean enque(int item){
        if(isFull()){
            System.out.println("Queue Full");
            return false;
        }
        arr[end++]=item;
        return true;
    }

    public  int deque(){
        if(isEmpty()){
            System.out.println("Queue is Empty;");
            return Integer.MIN_VALUE;
        }
        int removed=arr[0];

        for (int i = 1; i < end ; i++) {
            arr[i-1]=arr[i];
        }
        end--;
        return removed;
    }


    public void peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Element at front of Queue :" + arr[0]);
    }
    public boolean isEmpty(){
        return end == 0;
    }

    public boolean isFull() {
        return end==arr.length;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < end; i++) {
            System.out.print(arr[i] + "<--");
        }
        System.out.println("END");
    }
}
