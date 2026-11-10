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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> it = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                int result = Collections.binarySearch(it, temp.val);
                int insertionIndex = (result >= 0) ? result : -result - 1;
                it.add(insertionIndex, temp.val);
                temp = temp.next;
            }
        }
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        for(int x:it){
            temp.next = new ListNode(x);
            temp = temp.next;
        }
        return dummy.next;
    }
}
