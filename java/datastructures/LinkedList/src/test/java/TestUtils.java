package LinkedList;

import linkedList.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void testAppendSingleNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        assertEquals(1, linkedList.getHead().value);
        assertNull(linkedList.getHead().next);
    }

    @Test
    void testAppendMultipleNodes() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        assertEquals(1, linkedList.getHead().value);
        assertEquals(2, linkedList.getHead().next.value);
        assertEquals(3, linkedList.getHead().next.next.value);
        assertNull(linkedList.getHead().next.next.next);
    }

    @Test
    void testInsertBeforeMiddleNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(2);
        linkedList.insertBefore(3, 5);
        assertEquals(1, linkedList.getHead().value);
        assertEquals(5, linkedList.getHead().next.value);
        assertEquals(3, linkedList.getHead().next.next.value);
        assertEquals(2, linkedList.getHead().next.next.next.value);
        assertNull(linkedList.getHead().next.next.next.next);
    }

    @Test
    void testInsertBeforeFirstNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(2);
        linkedList.insertBefore(1, 5);
        assertEquals(5, linkedList.getHead().value);
        assertEquals(1, linkedList.getHead().next.value);
        assertEquals(3, linkedList.getHead().next.next.value);
        assertEquals(2, linkedList.getHead().next.next.next.value);
        assertNull(linkedList.getHead().next.next.next.next);
    }

    @Test
    void testInsertAfterMiddleNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(2);
        linkedList.insertAfter(3, 5);
        assertEquals(1, linkedList.getHead().value);
        assertEquals(3, linkedList.getHead().next.value);
        assertEquals(5, linkedList.getHead().next.next.value);
        assertEquals(2, linkedList.getHead().next.next.next.value);
        assertNull(linkedList.getHead().next.next.next.next);
    }

    @Test
    void testInsertAfterLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(2);
        linkedList.insertAfter(2, 5);
        assertEquals(1, linkedList.getHead().value);
        assertEquals(3, linkedList.getHead().next.value);
        assertEquals(2, linkedList.getHead().next.next.value);
        assertEquals(5, linkedList.getHead().next.next.next.value);
        assertNull(linkedList.getHead().next.next.next.next);
    }
}
