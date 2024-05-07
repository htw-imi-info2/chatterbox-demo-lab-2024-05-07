package linkedlist;

public class Node {
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
    Object data;
    Node next;
    @Override
    public String toString() {
        if (next == null)
            return data.toString();
        else
            return data.toString() + next.toString();
    }
}
