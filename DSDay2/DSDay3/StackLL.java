package DSDay3;

public class StackLL {

    Node top;
     int size;

    public StackLL(int size) {
        this.size = size;
    }

    public StackLL() {
    }
    public void push(int val){
        Node node = new Node(val);
        if(top==null){
            top=node;
            return;
        }
        Node temp= top;
        node.prev=temp;
        top=node;
        size++;
    }

    public int pop(){
        if(top==null){
            System.out.println("Cannot pop from empty stack");
            return Integer.MIN_VALUE;
        }
        Node temp= top;
        top=top.prev;
        return temp.value;
    }

    public  void  peek(){
        if(top==null){
            System.out.println("Cannot peek from empty stack");
            return;
        }
        Node temp= top;
        System.out.println( " Item "+temp.value +" Popped Sucessufully ");
    }

    public  void display(){
        if(top==null){
            System.out.println("Cannot peek from empty stack");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.value +"<--");
            temp=temp.prev;
        }
        System.out.println("END");

    }
}