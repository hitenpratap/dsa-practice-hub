package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem
public class MergePointOfTwoList {

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode current1 = head1;
        SinglyLinkedListNode current2 = head2;

        while (current1 != current2) {
            current1 = (current1 == null) ? head2 : current1.next;
            current2 = (current2 == null) ? head1 : current2.next;
        }
        return current1.data;
    }
}
