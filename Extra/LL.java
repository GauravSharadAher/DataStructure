package Extra;

import Extra.Node;

public class LL {
    Node head;
    int size;


    public LL() {
        this.size = 0;
    }


    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next=node;
        }
        size++;
    }


    public void insertLast(int value){

        Node node = new Node(value);
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        size++;
    }


    public void inserFirst(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            return;
        }
            Node temp= head;
            node.next=head;
            head=node;
        size++;
    }


    public void inserAt(int value,int index){
        if(index==1 ){
            inserFirst(value);
            return;
        }
        if (index==size+1){
            insertLast(value);
            return;
        }
        if(index>size){
            System.out.println("Index is less than entered position");
           // insertLast(value);
            return;
        }
        Node temp=head;
        for (int i = 2; i < index; i++) {
            temp=temp.next;
        }
        Node node= new Node(value,temp.next);
        temp.next=node;
        size++;

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



    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.printf(temp.value +"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }
}

