public class ReverseLinkedList {
    public static ListNode reverseList(ListNode node) {
        if (node == null) {
            return node;
        }
        return reverseList(node.next, node);
    }
    public static ListNode reverseList(ListNode node, ListNode head) {
        if (node.next == null) {
            return new ListNode(node.val, node);
        }
        else {
            head = new ListNode(node.next.val, head);
            return reverseList(node.next, head);
        }
    }

    public static void main(String[] args) {
  //      ListNode node = new ListNode(1, new ListNode(2, ne));
    //    reverseList();
    }
}
