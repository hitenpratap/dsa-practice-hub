package dsa.practice.hub.linkedlist.hackerrank;

// https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
public class CycleDetection {

    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null)
            return false;

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
