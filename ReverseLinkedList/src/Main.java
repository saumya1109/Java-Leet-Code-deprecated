import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = null;


    }

    public static ListNode reverseListwithPointers(ListNode head) {

        ListNode prev = null;
        ListNode current = head;


        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        head = prev;
        return head;

    }

    public ListNode reverseListWithStack(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }

        current.next = null;
        return dummy.next;
    }

}