package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem
public class InsertNodeAtHead {

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = llist;
        if (current != null) {
            node.next = current;
        }
        llist = node;
        return llist;
    }
}
