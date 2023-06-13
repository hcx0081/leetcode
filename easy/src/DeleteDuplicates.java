import java.util.HashMap;

/**
 * {@code @Description:} 83.删除排序链表中的重复元素
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        
        ListNode listNode = deleteDuplicates(n1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    
    public static ListNode deleteDuplicates(ListNode head) {
        HashMap<Object, Object> map = new HashMap<>();
        // 可以看作头结点
        ListNode h = new ListNode(0);
        // 头指针
        ListNode curr = h;
        // 接入head结点
        curr.next = head;
        while (curr.next != null) {
            if (map.containsKey(curr.next.val)) {
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
            map.put(curr.val, 1);
        }
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