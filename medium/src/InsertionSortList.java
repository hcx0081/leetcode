/**
 * {@code @Description:} 147.对链表进行插入排序？？？
 */
public class InsertionSortList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(2);
        // ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        // n3.next = n4;
        
        ListNode listNode = insertionSortList(n1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    
    public static ListNode insertionSortList(ListNode head) {
        // 创建一个新的头结点
        ListNode node = new ListNode();
        while (head != null) {
            // 重新回到头结点
            ListNode cur = node;
            
            while (cur.next != null && cur.next.val < head.val) {
                cur = cur.next;
            }
            
            ListNode nxt = head.next;
            
            // 制造一个假的指向下一个结点的结点
            head.next = cur.next;
            cur.next = head;
            
            head = nxt;
        }
        return node.next;
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