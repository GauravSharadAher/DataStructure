package DSDay1;

public class SinglyCircular {

    Node tail;
    int size;

    public SinglyCircular()
    {this.size=0;
    }


    public void insert(int value){
        Node node = new Node(value);
        if(tail==null){
            tail=node;
        }else{
            Node temp= tail.next;
            if(temp==tail){
                node.next=tail;
            }
            temp=node;
        }
        size++;
    }


    public void display(){
        Node temp= tail;
        while(temp.next!=tail){
            System.out.print(temp.value +"-->");
            temp= temp.next;
        }
        System.out.println("TAIL");
    }

}



