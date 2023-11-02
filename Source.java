class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static int sumList(Node<Integer> head) {
    int sum = 0;

    // If it is a single Node set ans to its value
    if (head.next == null)
      sum += head.val;

    // Loops while there is another Node in the linked List
    while (head.next != null) {

      // Adds current value to the total value
      sum += head.val;
      head = head.next;

      // Checks to see if it is the last Node and adds it to the total sum
      if (head.next == null)
        sum += head.val;

    } // whiile

    // Returns the sum of the linked list
    return sum;
  }

  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    // 2 -> 8 -> 3 -> -1 -> 7

    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(a));
  }
}
