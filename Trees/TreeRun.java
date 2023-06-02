package Trees;

public class TreeRun {
    public static void main(String[] args) {
        TreeMain t = new TreeMain();
        t.inesert(55);
        t.inesert(5);
        t.inesert(555);
        t.inesert(10);
        t.inesert(51);
        t.inesert(86);
        t.inesert(99);
        t.inorder(t.root);
    }
}
