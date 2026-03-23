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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode dummy = new ListNode(-1);
         ListNode merge= dummy;
         
         while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                 merge.next =l1;
                 l1=l1.next;
                 //merge=merge.next;
            }
            else{
                merge .next= l2;
                l2=l2.next;
               // merge= merge.next;
            }
             merge = merge.next;

         }
         if(l1 !=null ){
            merge.next=l1;
            
         }
         if(l2 !=null ){
            merge.next =l2;
            
         }
         
         return dummy.next;
    }
}