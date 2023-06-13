/**
 * {@code @Description:} 21.合并两个有序链表
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(4);
        n4.next = n5;
        n5.next = n6;
        
        ListNode listNode = mergeTwoLists(n1, n4);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 可以看作头结点
        ListNode node = new ListNode(0);
        // 头指针
        ListNode curr = node;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            } else {
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        // curr.next = l1 != null ? l1 : l2;
        return node.next;
    }
    
    static class ListNode {
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