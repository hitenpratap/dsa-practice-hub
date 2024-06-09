package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/reverse-a-linked-list/problem
public class ReverseLinkedList {

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        llist = prev;
        return llist;
    }
}
