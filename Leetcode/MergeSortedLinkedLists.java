import java.util.Objects;

public class MergeSortedLinkedLists {
    public static void main(String[] args) {

    }

    /*
     * You are given the heads of two sorted linked lists list1 and list2.
     * 
     * Merge the two lists in a one sorted list. The list should be made by splicing
     * together the nodes of the first two lists.
     * Return the head of the merged linked list.
     * Example 1:
     * Input: list1 = [1,2,4], list2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     * 
     * Example 2:
     * 
     * Input: list1 = [], list2 = []
     * Output: []
     * 
     * Example 3:
     * 
     * Input: list1 = [], list2 = [0]
     * Output: [0]
     * 
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode list3 = new ListNode();
        ListNode head3 = list3;
        while(Objects.nonNull(list1) && Objects.nonNull(list2))
        {
            int v1 = list1.val;
            int v2 = list2.val;
            if(v1 > v2)
            {
                list3.val = v1;
                list3.next = new ListNode(v2);
                list3 = list3.next;
            }
            else
            {
                list3.val = v2;
                list3.next = new ListNode(v1);
                list3 = list3.next;

            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return head3;
    }
    /*
            while (list1.next != null) {
            int v1 = list1.val;
            int v2 = list1.next.val;
            if (v1 > v2) {
                list1.val = v2;
                list1.next.val = v1;
            }
            list1 = list1.next;
        }
        while (list2.next != null) {
            int v3 = list2.val;
            int v4 = list2.next.val;
            if (v3 > v4) {
                list2.val = v4;
                list2.next.val = v3;
            }
            list2 = list2.next;
        }

     */
}
