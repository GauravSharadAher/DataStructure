package Trees;

public class TreeMain {
//    private Node root;
//
//    public Tree() {
//        root=null;
//    }
//    public Node getRoot() {
//        return root;
//    }
//
//    public void setRoot(Node root) {
//        this.root = root;
//    }
//
//    public boolean insert(int v) {
//        Node nn=new Node(v);
//        if(nn==null)
//            return false;
//        if(root==null)
//        {
//            root=nn;
//            return true;
//        }
//        Node t=root;
//        Node par;
//        while(t!=null)
//        {
//            par=t;
//            if(v>t.getData()) {
//                t=t.getRchild();
//            }
//            else {
//                t=t.getLchild();
//            }
//            if(t==null)
//            {
//                if(v>par.getData())
//                    par.setRchild(nn);
//                else
//                    par.setLchild(nn);
//            }
//        }
//        return true;
//    }

//    public void inorder(Node t) {
//        if(t==null)
//            return;
//        inorder(t.getLchild());
//        System.out.print("  "+t.getData());
//        inorder(t.getRchild());
//    }



      Node root;

    public TreeMain(Node root) {
        this.root = root;
    }

    public TreeMain() {
    }


    Node temp=root;

    public void inesert(int value){
        Node node = new Node(value);
        if(root==null){
            root=node;
        }else{
            Node temp= root;
            Node parent=null;
            while(temp!=null){
                parent=temp;
                if(node.value< temp.value){
                    temp= temp.lchild;
                }
                else{
                    temp=temp.rchild;
                }
            }
                if(node.value<parent.value){

                    parent.lchild=node;
                }
                if(node.value > parent.value){
                    parent.rchild=node;
                }
            }
        }
        public  void inorder(Node temp){
            if(temp==null){
                return;
            }
            inorder(temp.lchild);
            System.out.print(temp.value+ "-->");
            inorder(temp.rchild);
        }
    public  void postorder(Node temp){
        if(temp==null){
            return;
        }
        postorder(temp.lchild);
        postorder(temp.rchild);
        System.out.print(temp.value+ "-->");


    }
    public  void preorder(Node temp){
        if(temp==null){
            return;
        }

        System.out.print(temp.value+ "-->");
        preorder(temp.lchild);
        preorder(temp.rchild);
    }
    }


