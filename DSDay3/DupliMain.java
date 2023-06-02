package DSDay3;

import DSDay1.Node;

public class DupliMain{
    public static void main(String[] args) {
        DuplicateNodes d1= new DuplicateNodes();
//        DuplicateNodes d2 = new DuplicateNodes();
//        DuplicateNodes d3 = new DuplicateNodes();
        d1.insert(1);
        d1.insert(5);
        d1.insert(5);
        d1.insert(5);
        d1.insert(5);
        d1.insert(1);
//        d1.insert(50);
//        d1.insert(60);
//        d1.insert(70);
//        d1.insert(80);
//        d1.insert(90);
        d1.display();
        d1.palidrome();
        d1.display();
//        d2.insert(77);
//        d2.insert(66);
//        d2.insert(55);
//        d2.insert(44);
//        d2.insert(33);
//        d2.display();

//       d1.asc();
//
//        d1.display();

//        merge(d1,d2);
    }

//    public static void  merge(DuplicateNodes d1, DuplicateNodes  d2){
//        DSDay1.Node head1=d1.head;
//        DSDay1.Node head2=d2.head;
//        DSDay1.Node temp1=head1;
//        DSDay1.Node temp2=head2;
//        DuplicateNodes r= new DuplicateNodes();
//
//        while(temp1!=null && temp2!=null){
//            r.insert(temp1.value);
//            r.insert(temp2.value);
//            temp1=temp1.next;
//            temp2=temp2.next;
//        }
//        while(temp1!=null){
//            r.insert(temp1.value);
//            temp1=temp1.next;
//        }
//        while(temp2!=null){
//            r.insert(temp2.value);
//            temp2=temp2.next;
//        }
//        r.display();
//
//    }
}
