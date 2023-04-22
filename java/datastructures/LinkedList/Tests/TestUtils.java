import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void canInstantiateEmptyLinkedList() {
        LinkedList linkedList = new LinkedList();
        assertNull(linkedList.head);
    }

    @Test
    void canProperlyInsertIntoLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        assertEquals(1, linkedList.head.getValue());
    }

    @Test
    void headPropertyPointsToFirstNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(2);
        linkedList.insert(1);
        assertEquals(1, linkedList.head.getValue());
    }

    @Test
    void canProperlyInsertMultipleNodes() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        assertEquals(1, linkedList.head.getValue());
        assertEquals(2, linkedList.head.getNext().getValue());
        assertEquals(3, linkedList.head.getNext().getNext().getValue());
    }

    @Test
    void returnsTrueWhenValueExists() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        assertTrue(linkedList.includes(2));
    }

    @Test
    void returnsFalseWhenValueDoesNotExist() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        assertFalse(linkedList.includes(5));
    }

    @Test
    void canProperlyReturnAllValues() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> NULL", linkedList.toString());
    }
}

