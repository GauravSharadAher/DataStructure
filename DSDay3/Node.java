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

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", prev=" + prev +
                '}';
    }

    public Node() {
    }
}
