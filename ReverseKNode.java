class Solution {
    public ListNode reverseList(ListNode head){
        ListNode prevNode = head;
        ListNode currNode = head.next;
        while(currNode!=null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        return head;
    }
    public ListNode getKthNode(ListNode head,int k){
        k-=1;
        while(head!=null && k>0){
            k--;
            head = head.next;
        }
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;
        while(temp!=null){
            ListNode KthNode = getKthNode(temp,k);
            if(KthNode==null){
                if(prevLast!=null){
                    prevLast.next = temp;
                }
                break;
            }
            ListNode nextNode = KthNode.next;
            KthNode.next = null;
            reverseList(temp);
             if (temp == head) {
                head = KthNode;
            } else {
                prevLast.next = KthNode;
        }
        prevLast = temp;
         temp = nextNode;
    }
    return head;
    }
}