package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Append elements to the list
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(2);

        // Print the list
        printList(linkedList);

        // Insert 5 before 3
        linkedList.insertBefore(3, 5);
        printList(linkedList);

        // Insert 7 after 1
        linkedList.insertAfter(1, 7);
        printList(linkedList);

        // Insert 9 after 2 (last node)
        linkedList.insertAfter(2, 9);
        printList(linkedList);
    }

    public static void printList(LinkedList linkedList) {
        ListNode current = linkedList.getHead();
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("X");
    }
}
