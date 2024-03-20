/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode node = list1;
        int nodeNum = 0;
        while (nodeNum != a - 1) {
            node = node.next;
            nodeNum++;
        }

        ListNode nodeAfterInsertion = list1;
        nodeNum = 0;
        while (nodeNum != b + 1) {
            nodeAfterInsertion = nodeAfterInsertion.next;
            nodeNum++;
        }

        ListNode end = list2;
        while (end.next != null) {
            end = end.next;
        }

        node.next = list2;
        end.next = nodeAfterInsertion;
        return list1;
    }
}
