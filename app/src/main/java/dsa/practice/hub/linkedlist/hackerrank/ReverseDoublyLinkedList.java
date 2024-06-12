package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
public class ReverseDoublyLinkedList {

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        if (llist == null)
            return null;

        DoublyLinkedListNode current = llist;
        DoublyLinkedListNode temp = null;

        // Swap next and prev pointers for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            llist = temp.prev;
        }

        return llist;
    }
}
