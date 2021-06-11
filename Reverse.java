public class Reverse {
  public static ListNode reverse(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    } else {
                            //  Example (& = head) ([] = ptr) (% = prev)
                            //  ========================================
                            //      &1-->2-->3
      ListNode ptr = head;  //    &[1]-->2-->3->
      ListNode prev = null; // %  &[1]-->2-->3->

      while (ptr != null) {
        ptr = ptr.next;     //     &1-->[2]-->3->
        head.next = prev;   //  %<-&1   [2]-->3->
        prev = head;        //  <-&%1   [2]-->3->
        head = ptr;         //   <-%1  &[2]-->3->
      }

      return prev;          //    <-1<-2<-%3  &[]
    }
  }
}
