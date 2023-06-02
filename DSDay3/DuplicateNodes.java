package DSDay3;

import DSDay1.Node;

public class DuplicateNodes {
   Node head;
    int size;


    public DuplicateNodes( int size) {
        this.size=0;
    }

    public DuplicateNodes() {
    }

    public void insert(int value){
        DSDay1.Node node= new DSDay1.Node(value);
        if(head==null){
            head=node;
        }else{
            DSDay1.Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.printf(temp.value +"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        head=head.next;
        size--;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp=head;
        for (int i = 2; i <size ; i++) {
            temp=temp.next;
        }
        temp.next=null;

        size--;
    }

    public void deleteAt(int pos){
        if(pos==1){
            deleteFirst();
            return;
        }
        if(pos==size){
            deleteLast();
            return;
        }
        Node temp=head;
        for (int i = 2; i <pos ; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }

//    public void removedupli(){
//        Node temp=head;
//        if(head==null){
//            System.out.println("No Nodes present");
//            return;
//        }
//        Node i;
//        Node j;
//
//        int count1=0;
//            for(i=head;i!=null && i.next!=null;i=i.next){
//
//                for(j=i;j.next!=null;j=j.next){
//                     if(i.value==j.next.value){
//                         j.next=j.next.next;
//                    }
//                }
//            }
//        display();

//        }

    public void removedupli(){
        if(head==null){
            System.out.println("No Nodes present");
            return;
        }
        Node i=head;
        Node j;

        while(i!=null && i.next!=null){
            j=i;
            while(j.next!=null){
                if(i.value==j.next.value){
                    j.next=j.next.next;
                }else{
                    j=j.next;
                }
            }
            i=i.next;

        }
        display();
    }


    public void middle(){
        if(head==null){
            System.out.println("No Nodes present");
            return;
        }
        Node temp= head;
        if(size%2==0){
            for (int i = 1; i <size/2; i++) {
                temp=temp.next;
            }
            System.out.println(temp.value+" "+temp.next.value);
        }
        for (int i = 1; i <size/2; i++) {
            temp=temp.next;
        }
            System.out.println(temp.next.value);
    }



    public void asc() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty LL");
            return;
        }
        Node first=temp;

        while(first!=null){
            Node second=first.next;
                while(second!=null){
                    if(first.value> second.value){
                        int data=first.value;
                        first.value=second.value;
                        second.value=data;
                    }
                    second=second.next;
                }
                first=first.next;
        }
        display();
    }


    public  void reversepos(int value){

        Node temp = head;
        if (head == null) {
            System.out.println("Empty LL");
            return;
        }
        int count=1;
        while(temp!=null && temp.value!=value   ){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
        if(count>size){
            System.out.println("Element not found");
            return;
        }
        temp=head;

       for(int i=1; i<=count/2; i++){
           Node inner=head;
           for(int j=1; j<count-i; j++ ){
               inner=inner.next;
           }
           int data= temp.value;
           temp.value=inner.value;
           inner.value=data;
           temp=temp.next;
       }



    }


    public void palidrome(){
        Node temp = head;
        int count=0;
        if (head == null) {
            System.out.println("Empty LL");
            return;
            }
        for (int i = 1; i <=size/2 ; i++) {
            Node trav=head;
            for (int j = 1; j <=size-i ; j++) {
                trav=trav.next;
            }
            if(temp.value== trav.value){
                count++;
            }
            else{
                System.out.println("Not a palindrome");
                return;
            }
            temp=temp.next;
            }
            System.out.println("Palindrome");
        }



}













