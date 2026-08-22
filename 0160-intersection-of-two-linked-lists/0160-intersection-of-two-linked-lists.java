/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        int cnt1 = 0;
        int cnt2 = 0;
        while(temp != null){
            cnt1++;
            temp = temp.next;
        }

        temp = headB;

        while(temp != null){
            cnt2++;
            temp = temp.next;
        }

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int diff = Math.abs(cnt1 - cnt2);

        
        if (cnt1 > cnt2) {
            for (int i = 0; i < diff; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }
        }

        
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
        

    }
}