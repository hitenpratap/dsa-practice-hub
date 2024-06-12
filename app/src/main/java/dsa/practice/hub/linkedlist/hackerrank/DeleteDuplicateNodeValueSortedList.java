package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
public class DeleteDuplicateNodeValueSortedList {

    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        if (llist == null) {
            return null;
        }
        SinglyLinkedListNode current = llist;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return llist;
    }
}
