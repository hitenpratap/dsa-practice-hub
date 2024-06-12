package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
public class InsertNodeIntoDoublySortedList {

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        DoublyLinkedListNode current = llist;
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (current == null) {
            return newNode;
        } else if (current.data >= data) {
            newNode.next = current;
            current.prev = newNode;
            return newNode;
        } else {
            while (current.next != null && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            newNode.prev = current;
            current.next = newNode;
            return llist;
        }
    }
}
