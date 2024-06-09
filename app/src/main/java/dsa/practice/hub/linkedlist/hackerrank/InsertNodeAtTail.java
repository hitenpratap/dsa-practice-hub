package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
public class InsertNodeAtTail {

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head;
        if (current == null) {
            head = node;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        return head;
    }
}
