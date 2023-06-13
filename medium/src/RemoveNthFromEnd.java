/**
 * {@code @Description:} 19.删除链表的倒数第N个结点
 */
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode listNode = removeNthFromEnd(n1, 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // 虚拟头结点
        ListNode h = new ListNode(0);
        // 头指针
        ListNode curr = h;
        // 接入head结点
        curr.next = head;
        int len = 0;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }
        // 重回虚拟头结点
        curr = h;
        // 遍历到要删除的结点的前一个结点
        /*
         * 例如：h 1 2 3 4 5，要删除倒数第2个结点：4
         * 此时已知长度：5
         * 需要遍历到要删除的结点的前一个结点，所以需要遍历3次
         *  */
        System.out.println("len:" + len);
        for (int i = 0; i < len - n; i++) {
            curr = curr.next;
        }
        // 要删除的结点
        ListNode remove = curr.next;
        curr.next = remove.next;
        return h.next;
    }
    
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode() {
        }
        
        ListNode(int val) {
            this.val = val;
        }
        
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}