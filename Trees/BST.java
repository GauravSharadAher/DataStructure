package Trees;

public class BST {
    Node root;
    int edge;
    public BST() {
        this.edge=0;
    }


    public void insert(int value){
        Node node = new Node(value);
        if(root==null){
            root=node;
        }else{
            Node temp=root;
            Node parent=root;
            while(temp!=null){
                parent=temp;
                if(value<temp.value){
                    temp=temp.lchild;
                }else{
                    temp=temp.rchild;
                }
            }
            if(node.value>parent.value){
                parent.rchild=node;
            }
            if(node.value<parent.value){
                parent.lchild=node;
            }
        }

    }
    public void delete(int value){

      if(root==null){
          return;
      }
        Node temp=root;
        Node parent;
        // for root deletion
        // this will delete the root by either taking min from
        // right or max from left
        if(temp.value==value){
            if(temp.rchild!=null){
                System.out.println(temp.value);
                Node temp2=temp;
                Node temp1=temp2.rchild;
                Node p2=temp2;
                while(temp1.lchild!=null){
                    p2=temp1;
                    temp1=temp1.lchild;
                }
                temp.value=temp1.value;
                p2.lchild=null;
            }
            else if (temp.lchild!=null){

                Node temp2=temp;

                Node temp1=temp2.lchild;
                Node p2=temp2;
                while(temp1.rchild!=null){
                    p2=temp1;
                    temp1=temp1.rchild;
                }
                temp.value=temp1.value;
                p2.rchild=null;
            }
            return;
        }

        // this loop will take the pointer to valued location
      while(temp.value!=value){

          System.out.println(temp.value);
           parent=temp;
           if(value<temp.value){
               temp=temp.lchild;

           }else{
               temp=temp.rchild;

           }

          System.out.println(temp.value);

           // this is for leaf node deletion
           if(temp.lchild==null && temp.rchild==null){
                   if(parent.lchild==temp){
                       parent.lchild=null;
                   }else{
                       parent.rchild=null;
                   }
               }

           // here afrer getting that pt we check left and right in one if
          if(temp.value==value){
           // deletion for internal node.

            if(temp.rchild!=null){

                Node temp2=temp;

                Node temp1=temp2.rchild;
                Node p2=temp2;

                while(temp1.lchild!=null){
                    p2=temp1;
                    temp1=temp1.lchild;
                }

                temp.value=temp1.value;

                p2.rchild=null;
                break;

            }
            // this if is for  right child iteration for internal
              // node deletion
                if(temp.lchild!=null){

                Node temp2=temp;

                Node temp1=temp2.lchild;
                Node p2=temp2;
                while(temp1.rchild!=null){
                    p2=temp1;
                    temp1=temp1.rchild;
                }

                temp.value=temp1.value;

                p2.rchild=null;
                break;
            }
           }
        }
        }
        public void search(int value){
            

        }
    public void inorder(Node trav){
        if(trav==null){
            return;
        }
        inorder(trav.lchild);
        System.out.print(trav.value+"->");
        inorder(trav.rchild);
        }
    }


