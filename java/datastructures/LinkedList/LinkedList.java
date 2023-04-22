public class LinkedList {
    Node head;

    // Class representing node in the LinkedList
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

    // LinkedList Constructor
    public LinkedList() {
        head = null;
    }

    // Insert a new node at the head of the LinkedList
    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    // checks if value exists in the LinkedList
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

    // return a string representation of the LinkedList
    public String toString() {
        Node current = head;
        StringBuilder output = new StringBuilder();
        while (current != null) {
            output.append("{ ").append(current.getValue()).append(" } -> ");
            current = current.getNext();
        }
        output.append("NULL");
        return output.toString();
    }

    // Main method
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);

        System.out.println(linkedList.includes(2));
        System.out.println(linkedList.includes(5));
        System.out.println(linkedList);
    }
}
