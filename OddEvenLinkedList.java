class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode even = head;
        ListNode even_head = even;
        ListNode odd = head.next;
        ListNode odd_head = odd;
        if(odd==null) return head;
        while(even.next!=null && odd.next!=null){
               even.next=odd.next;
               even = even.next;
               odd.next = even.next;
               odd = odd.next;
        }
    even.next=odd_head;
    return even_head;
    }
}