package LinkedList;
 
/* Problem link: https://leetcode.com/problems/add-two-numbers/ */

// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class lc_2_addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyHead = new ListNode(0); 
        
        ListNode a = l1, b = l2, curr = dummyHead;
        int carry = 0;
        
        while(a != null || b != null) {
            int x = (a != null) ? a.val:0; 
            int y = (b != null) ? b.val:0;
            
            int sum = x + y + carry; 
            carry = sum/10; 
            
            curr.next = new ListNode(sum%10); 
            curr = curr.next; 
            
            if(a != null) a = a.next;
            if(b != null) b = b.next; 
        }
        
        if(carry > 0) {
            curr.next = new ListNode(carry); 
        }
        
        return dummyHead.next;
    }
}