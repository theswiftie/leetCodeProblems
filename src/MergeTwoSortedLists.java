public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode head = new ListNode();
            ListNode curr = new ListNode();

            if (list1 == null && list2 == null){
                return head;
            }
            else {
                if (list2 == null || (list1 != null && list1.val > list2.val)) {
                    if (head.val == 0) {
                        head = new ListNode(list1.val, curr);
                    } else {
                        curr = new ListNode(list1.val, new ListNode());
                        curr = curr.next;
                    }
                    list1 = list1.next;
                } else if (list1 == null || list1.val < list2.val) {
                    if (head.val == 0) {
                        head = new ListNode(list2.val, curr);
                    } else {
                        curr = new ListNode(list2.val, new ListNode());
                        curr = curr.next;
                    }
                    list2 = list2.next;
                } else {
                    if (head.val == 0) {
                        head = new ListNode(list1.val, new ListNode(list2.val, new ListNode()));
                    } else {
                        curr = new ListNode(list1.val, new ListNode(list2.val, new ListNode()));
                    }
                    list1 = list1.next;
                    list2 = list2.next;
                }
                return mergeTwoLists(list1, list2);
            }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2= new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(l1, l2));
    }
}
