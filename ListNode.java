import java.util.Scanner;

/**
 * A singly linked list.
 */
public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    ListNode ptr = this;
    str.append('[');
    while (ptr != null) {
      str.append(ptr.val);
      if (ptr.next != null) {
        str.append(',');
      }
      ptr = ptr.next;
    }
    str.append(']');
    return str.toString();
  }

  /**
   * Creates a ListNode from a string representation of a
   * list of integers, e.g., "1 2 3 4 5".
   */
  public static ListNode from(String stringRepresentation) {
    Scanner in = new Scanner(stringRepresentation);
    if (in.hasNextInt()) {
      int initialValue = in.nextInt();
      ListNode head = new ListNode(initialValue);
      ListNode ptr = head;
      while (in.hasNextInt()) {
        ListNode next = new ListNode(in.nextInt());
        ptr.next = next;
        ptr = ptr.next;
      }
      return head;
    } else {
      return null;
    }
  }

  /**
   * Creates a ListNode from a list of strings,
   * each representing an integer, e.g., ["1", "2", "3", "4", "5"]
   */
  public static ListNode from(String[] list) {
    StringBuilder joinedString = new StringBuilder();
    for (int i = 0; i < list.length; i++) {
      joinedString.append(list[i]);
      joinedString.append(' ');
    }
    return ListNode.from(joinedString.toString());
  }
}
