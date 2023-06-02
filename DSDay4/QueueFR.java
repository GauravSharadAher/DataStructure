package DSDay4;

public class QueueFR {
    int [] arr;
    int front=-1;
    int end=-1;

    private static final int DEFAULT_SIZE=5;

    public QueueFR(int size) {
        this.arr= new int[size];
    }
    public QueueFR(){
        this(DEFAULT_SIZE);
    }

    public void enque(int item)
    {
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(end==-1){
            front=0;
        }
        end++;
        arr[end]=item;
    }

    public int deque(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        int removed=arr[front++];
        if(front==end+1){
            front=end=-1;
        }
        return removed;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Cannot peek from from empty Queue");
            return;
        }
        System.out.println(arr[front]);
    }

    public boolean isEmpty(){
        return end == -1;
    }

    public boolean isFull() {
        return end==arr.length-1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        for (int i = front; i <= end; i++) {
            System.out.print(arr[i]+"<--");
        }
        System.out.println("END");
    }
}
