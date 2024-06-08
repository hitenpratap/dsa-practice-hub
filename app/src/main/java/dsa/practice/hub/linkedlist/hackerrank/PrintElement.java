package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
public class PrintElement {
    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
