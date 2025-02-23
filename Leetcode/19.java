class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while (temp != null){
            len++;
            temp = temp.next;
        }
        if (len == n)
            return head.next;   
        temp = head;
        int ind = len - n - 1;
        while (ind > 0){
            temp = temp.next;
            ind--;
        }
        temp.next = temp.next.next;
        return head;
    }
}