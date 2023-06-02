package DSDay4;

public class QueueMain {
    public static void main(String[] args) {
//        Queue q = new Queue();
        QueueFR q1= new QueueFR();
        CircularQueue c1= new CircularQueue();
        c1.enque(10);
        c1.enque(20);
        c1.enque(30);
        c1.enque(40);
        c1.enque(60);
//        q1.display();
        c1.deque();
//        q1.peek();
       c1.display();
    }
}
