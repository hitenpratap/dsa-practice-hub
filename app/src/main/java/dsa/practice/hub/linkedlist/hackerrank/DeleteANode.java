package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
public class DeleteANode {

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here
        SinglyLinkedListNode current = llist;
        if (position == 0) {
            if (current.next == null) {
                return null;
            } else {
                llist = current.next;
                return llist;
            }
        } else {
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            return llist;
        }
    }
}
