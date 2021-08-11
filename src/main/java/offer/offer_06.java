package offer;

import java.util.Stack;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curNode = head;
        while (curNode != null) {
            stack.push(curNode.val);
            curNode = curNode.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            res[i++] = stack.pop();
        }
        return res;
    }

    public int[] reversePrint1(ListNode head) {
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        int[] res = new int[len];
        cur = head;
        while (cur != null) {
            res[len - 1] = cur.val;
            len--;
            cur = cur.next;
        }
        return res;
    }
}
