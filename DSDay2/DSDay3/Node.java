package DSDay3;

public class Node {
    int value;
    Node prev;

    public Node(int value) {
        this.value=value;
    }

    public Node(int value, Node prev) {
        this.value = value;
        this.prev = prev;
    }

    public Node() {
    }
}
