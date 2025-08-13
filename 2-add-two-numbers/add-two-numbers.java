class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode prev = null; // track the last processed node

        int len1 = len(l1);
        int len2 = len(l2);
        int carry = 0;

        if (len1 >= len2) {
            while (temp1 != null && temp2 != null) {
                int x = temp1.val + temp2.val + carry;
                carry = 0;
                if (x > 9) {
                    x = x % 10;
                    carry = 1;
                }
                temp1.val = x;
                prev = temp1; // ✅ always update prev
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            while (temp1 != null) {
                int x = temp1.val + carry;
                carry = 0;
                if (x > 9) {
                    x = x % 10;
                    carry = 1;
                }
                temp1.val = x;
                prev = temp1; // ✅
                temp1 = temp1.next;
            }
        } else {
            while (temp1 != null && temp2 != null) {
                int x = temp1.val + temp2.val + carry;
                carry = 0;
                if (x > 9) {
                    x = x % 10;
                    carry = 1;
                }
                temp2.val = x;
                prev = temp2; // ✅ always update prev
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            while (temp2 != null) {
                int x = temp2.val + carry;
                carry = 0;
                if (x > 9) {
                    x = x % 10;
                    carry = 1;
                }
                temp2.val = x;
                prev = temp2; // ✅
                temp2 = temp2.next;
            }
        }

        // attach carry node if needed
        if (carry == 1) {
            prev.next = new ListNode(1); // ✅ no more NPE
        }

        return (len1 >= len2) ? l1 : l2;
    }

    private int len(ListNode a) {
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }
}
