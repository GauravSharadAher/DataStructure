package Assignment;

import DSDay1.Node;

public class LinkedListMain {
    public static void main(String[] args) {

        Cyclecheck l1 = new Cyclecheck();
        l1.head = new Node(1);
        Node s1 = new Node(12);
        Node s6 = new Node(2);
        Node s2 = new Node(3);
        Node s3 = new Node(132);
        Node s4 = new Node(500);
        Node s5 = new Node(111);
        l1.head.next=s1;
        s1.next=s6;
        s6.next=s2;
        s2.next=s3;
        s3.next=s4;
        s4.next=s5;
        s5.next=null;
        l1.cycle();


//
//
//
//        l1.insert(30);
//        l1.insert(20);
//       l1.insert(55);
//        l1.insert(98);
//        l1.insert(99);
//        l1.insert(100);
//
//        l1.display();
////      l1.insertA(1,89);
//        l1.deleteA(5);
//      l1.display();
//
//        SinglyCircular s1= new SinglyCircular();
//        s1.insertF(10);
//        s1.insertF(20);
//        s1.insertF(30);
//        s1.insertF(50);
//        s1.insertF(60);
//        s1.insertL(89);
//       s1.insertAt(55,1);
//        s1.display();
//
//        s1.deleteAt(8);
//        s1.display();
    }
}
