public class Main {
  private static final String USAGE = "Please specify the list to reverse, e.g, 1 2 3 4 5.";

  public static void main(String[] args) {
    if (args.length < 1) {
      System.err.println(USAGE);
      return;
    } else {
      ListNode list = ListNode.from(args);
      System.out.println(Reverse.reverse(list));
    }
  }
}
