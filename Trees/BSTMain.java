package Trees;

public class BSTMain {
    public static void main(String[] args) {
        BST b= new BST();
        b.insert(50);
        b.insert(25);
        b.insert(89);
        b.insert(26);
        b.insert(19);
        b.insert(79);
        b.insert(91);
        b.inorder(b.root);
        b.delete(50);
        System.out.println();
        b.inorder(b.root);
    }
}
