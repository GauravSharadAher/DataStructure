package Assignment;

import DSDay1.Node;

public class Cyclecheck {
    Node head;
    int size;


    public Cyclecheck(int size) {
            this.size=0;
    }

    public Cyclecheck() {
    }

    public void insert(int value){
        Node node= new  Node(value);
        if(head==null){
            head=node;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        size++;
    }




    public void inserF(int value){
        Node node= new Node(value);
        if(head!=null){
        node.next=head;
        head=node;
        }else{
            head=node;
        }
        size++;
    }


    public void insertlast(int value){
        Node node= new Node(value);
        Node temp =head;
        if(temp==null){
            temp=node;
        }else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void insertA(int pos,int value){

        if(pos>size){
            System.out.println("Array out of index");
            return;
        }
        if(pos==1){
            inserF(value);
            return;
        }
        if(pos==size){
            insert(value);
            return;
        }
        Node node= new Node(value);
        Node temp=head;
        for (int i = 2; i <pos ; i++) {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }


    public void deleteL(){
        Node temp= head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    public void delF(){
        if(size==0){
            System.out.println("No LinkedList present");
            return;
        }else{
        head=head.next;
        }
        size--;
    }



    public void deleteA(int pos){
        if(pos>size){
            System.out.println("LinkedList size is less than given index");
            return;
        }
        if(pos==1){
            delF();
            return;
        }
        if(pos==size){
            deleteL();
            return;
        }
        Node temp=head;
        for (int i = 2; i < pos; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }

    public void insertAt(int value, int pos){
        if(pos>size){
            System.out.println("Position greater than size");
            return;
        }
        Node node=new Node(value);
        Node temp1;
        Node temp=head;
        int count=2;

        while(temp.next!=null && count<pos){
            count++;
            temp=temp.next;
        }
        temp1=temp.next;
        temp.next=node;
        temp.next.next=temp1;
        size++;
    }

    public void deletefirst(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }else{
        head=head.next;
        //head=temp
        }
        size--;
    }

    public void deletelast(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }else{
           while(temp.next.next!=null){
               temp=temp.next;
           }
           temp.next=null;
        }
        size--;
    }

    public void deleteAt(int pos){
        if(pos>size){
            System.out.println("Position greater than the size");
            return;
        }else{
            Node temp=head;
            int count=2;
            while(temp.next!=null && count<pos){
                count++;
                System.out.println(count);
                temp=temp.next;
            }
            if(temp.next.next==null){
                temp.next=null;
                return;
            }
            Node temp2=temp.next.next;
            temp.next=temp2;
            size--;

        }
    }

    public void display(){
        Node temp=head;
        System.out.println("hi");
        while(temp!=null){
            System.out.print(temp.value +"-->");
            temp=temp.next;
        }
        System.out.println("TAIL");
        System.out.println(size);
    }



    public void cycle()
    {
        Node fast= head;
        Node slow=head;
        boolean flag1 = false;
        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                flag1=true;
                break;
            }
        }
        if(flag1){
            slow=head;
            while(slow!=fast){
              fast=fast.next;
              slow=slow.next;
            }
            System.out.println("CYCLE STARTS FROM :" +slow.value);
        }else{
            System.out.println(" Not a CYCLE  :");
        }

    }










}