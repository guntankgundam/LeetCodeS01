import util.ListNode;

public class _002_AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int sum = 0;
        ListNode cur = dummy;
        ListNode p1 = l1, p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1 != null) {
                sum += p1.getVal();
                p1 = p1.getNext();
            }
            if (p2 != null) {
                sum += p2.getVal();
                p2 = p2.getNext();
            }
            cur.setNext(new ListNode(sum % 10));
            sum /= 10;
            cur = cur.getNext();
        }
        if (sum == 1) {
            cur.setNext(new ListNode(1));
        }
        return dummy.getNext();
    }

    public static void main(String[] args) {
        // 创建一个链表
        ListNode l1 = new ListNode(5);
        l1.setNext(new ListNode(8));
        l1.getNext().setNext(new ListNode(3));
        // 创建一个链表
        ListNode l2 = new ListNode(3);
        l2.setNext(new ListNode(2));
        l2.getNext().setNext(new ListNode(1));

        ListNode result = addTwoNumbers(l1, l2);
        // 打印结果
        while (result != null) {
            System.out.println(result.getVal());
            result = result.getNext();
        }


    }
}
