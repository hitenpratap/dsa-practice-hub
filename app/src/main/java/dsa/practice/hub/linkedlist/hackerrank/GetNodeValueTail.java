package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
public class GetNodeValueTail {

    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode fast = llist;
        SinglyLinkedListNode slow = llist;
        for (int i = 0; i <= positionFromTail; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
