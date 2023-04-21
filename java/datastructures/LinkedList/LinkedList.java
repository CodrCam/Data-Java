public class LinkedList {
    private Node head;

    static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public LinkedList() {
        head = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public String toString() {
        Node current = head;
        StringBuilder output = new StringBuilder();
        while (current != null) {
            output.append("{").append(current.getValue()).append(" } -> ");
            current = current.getNext();
        }
        output.append("NULL");
        return output.toString();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        System.out.println(linkedList.includes(2));  // true
        System.out.println(linkedList.includes(5));  // false
        System.out.println(linkedList);  // { 3 } -> { 2 } -> { 1 } -> NULL
    }
}
