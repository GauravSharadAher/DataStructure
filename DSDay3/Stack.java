package DSDay3;

public class Stack {

    public  int[] arr;

    private static final int DEFAULT_SIZE=10;


    int top=-1;


    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.arr =  new  int[size];
    }



    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        top++;
        arr[top]=item;
        return true;
    }

    public int pop(){
       if(isEmpty()){
           System.out.println("Stack is Empty");
           return -1;
       }
        System.out.println( "Element "+arr[top]+ " Popped Successfully ");
       return arr[top--];

    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        System.out.println( "Item at top of stack " + arr[top]);
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull() {
        return top==arr.length-1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack Empty");
        }
        for (int i = top; i >=0 ; i--) {
            System.out.print(arr[i]+"<--");
        }
        System.out.println("END");
    }
}
