/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        // In String everytime we modify it a new string is created but
        // In StringBuilder it modifies in the same heap of string
        // Hence the time and space taken is reduced
        
        StringBuilder check = new StringBuilder("");
        StringBuilder check2 = new StringBuilder("");

        int node =0;
        while (head != null){
            node= head.val;
            check.append(node);
            check2.insert(0,node);
            head=head.next;
        }

        return check.toString().equals(check2.toString());
    }
}
