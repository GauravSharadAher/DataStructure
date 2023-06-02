package Trees;

public class Node {
     int value;
     Node lchild;
     Node rchild;

    public Node(int value, Node lchild, Node rchild) {
        this.value = value;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    public Node(int value) {
        this.value = value;
        this.lchild=null;
        this.rchild=null;
    }




}
