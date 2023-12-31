package TopInterview150Medium;

public class MinStack {
    private Node head;

    public MinStack() {

    }

    public void push(int val) {
        if (head == null) {
            this.head = new Node(val, val, null);
        } else {
            this.head = new Node(val, Math.min(val, this.head.min), this.head);
        }
    }

    public void pop() {
        this.head = this.head.next;
    }

    public int top() {
        return this.head.value;
    }

    public int getMin() {
        return this.head.min;
    }

    private static class Node {
        int value;
        int min;
        Node next;

        private Node(int value, int min, Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }
    }
}
