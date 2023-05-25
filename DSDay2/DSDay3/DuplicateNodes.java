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
    if(head==null){
        System.out.println("Empty LL");
        return;
    }

    while(temp!=null && temp.next!=null){
        Node temp2= temp;
        while(temp2!=null){
            if(temp.value>temp2.value){
                int swap= temp.next.value;
                temp.next.value=temp.value;
                temp.value=swap;
            }
            temp2=temp2.next;
        }
        temp=temp.next;

    }
        display();
    }
}




