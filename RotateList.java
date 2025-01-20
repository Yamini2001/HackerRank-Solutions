class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        int length = 1;
        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
            length++;
        }
        if(k%length==0){
            return head;
        }
        k = k%length;
        tail.next = head;
        ListNode lastNode = findNthNode(head,length-k);
        head = lastNode.next;
        lastNode.next = null;
        return head;        
    }
    public static ListNode findNthNode(ListNode temp,int d){
        int count = 1;
        while(temp!=null){
            if(count==d){
                return temp;
            }
            count++;
            temp = temp.next;
        }
        return temp;
    }

}