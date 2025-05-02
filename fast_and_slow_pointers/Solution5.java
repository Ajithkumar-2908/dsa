/*class ListNode {
  int val = 0;
  ListNode next;

  ListNode(int value) {
    this.val = value;
  }
}*/

class Solution3 {

//Attempt 1
  /*

  public boolean isPalindrome(ListNode head) {
    // TODO: Write your code here

    if (head == null || head.next == null) {
      return true;
    }

    ListNode fast = head;
    ListNode slow = head;

    while( fast != null && fast.next != null) {

      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        break;
      }

    }

    //reverse the second half of the ListNode
    ListNode headSecondHalf = listReverse(slow);
    ListNode copyHeadSencondHalf = headSecondHalf;

    while(head != null && headSecondHalf != null) {

      if(head.val != headSecondHalf.val) {
        break;
      }
      head = head.next;
      headSecondHalf = headSecondHalf.next;

    }
    listReverse(copyHeadSencondHalf);

    if(head == null || headSecondHalf == null) {
      return true;
    }
    return false;
  }

  public ListNode listReverse(ListNode head) {

    ListNode prev = null;
    while(head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;

  }
  */

    //Attempt 2

    public boolean isPalindrome(ListNode head) {
        // TODO: Write your code here

        if (head == null || head.next == null) {
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        ListNode headSecondHalf = linkedlistReverse(slow);
        ListNode copyOfHeadSecondHalf = headSecondHalf;

        while (head != null && headSecondHalf != null) {
            if (head.val != headSecondHalf.val) {
                break;
            }
            head = head.next;
            headSecondHalf = headSecondHalf.next;
        }
        linkedlistReverse(copyOfHeadSecondHalf);
        if (head == null || headSecondHalf == null) {
            return true;
        }
        return false;
    }

    public ListNode linkedlistReverse(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }


}
