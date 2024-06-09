package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
public class InsertNodeAtSpecificPosition {

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data,
            int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = llist;
        if (position == 0) {
            if (current == null) {
                llist = node;
            } else {
                node.next = current;
                llist = node;
            }
        } else {
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        return llist;
    }
}
