import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }

        int s = arr.size();
        for(int i=0;i<s;i++){
            if(arr.get(i)==arr.get(s-1-i)){
                return true;
            }
        }
        return false;
    }
}