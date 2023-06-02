package DSDay4;

public class CircularQueue {
    int [] arr;
    private static final int DEFAULT_SIZE=5;

    int front=0;
    int end=0;
    int size;

    public CircularQueue(int size) {
        this.arr= new int [size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }


    public boolean enque(int item){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return false;
        }
        arr[end++]=item;
        end=end % arr.length;
        size++;
        return true;
    }

    public int deque(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return Integer.MIN_VALUE;
        }
        int removed =arr[front++];
        front=front % arr.length;
        size--;
        return removed;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return;
        }
        System.out.println("First Item in queue :" + arr[front]);
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return;
        }
        int i=front;
        do{
            System.out.print(arr[i]+ "<--");
            i++;
            i=i% arr.length;

        }while(i!=end);
        System.out.println("END");
    }


    public boolean isEmpty(){
        return end == -1;
    }

    public boolean isFull() {
        return end==arr.length-1;
    }
}
