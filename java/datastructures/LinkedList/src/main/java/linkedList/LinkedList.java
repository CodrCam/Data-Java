package linkedList;

public class LinkedList {
    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int newValue) {
        ListNode newNode = new ListNode(newValue);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertBefore(int value, int newValue) {
        ListNode newNode = new ListNode(newValue);

        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (head.value == value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode temp = head;
        while (temp.next != null && temp.next.value != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            throw new IllegalStateException("Value not found in the list");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void insertAfter(int value, int newValue) {
        ListNode newNode = new ListNode(newValue);

        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        ListNode temp = head;
        while (temp != null && temp.value != value) {
            temp = temp.next;
        }

        if (temp == null) {
            throw new IllegalStateException("Not in list");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

        public ListNode getHead() {
            return head;
        }

}
