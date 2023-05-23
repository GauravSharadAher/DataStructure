package DSDay2;

public class Node {
    int value;
    Node next;
    Node prev;
    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }
}
