
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode cur=head;
        if ((head == null)||(head.next == null))
            return head;
        while(cur!=null)
        {
            if ((cur == null)||(cur.next == null))
            return head;
            int temp=cur.val;
            cur.val=cur.next.val;
            cur.next.val=temp;
            cur=cur.next.next;
        }
        return head;
        
    }
}