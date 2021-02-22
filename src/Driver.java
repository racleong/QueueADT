public class Driver {
  private static QueueADT<Integer> queue = new ArrayListQueue<>();

  public static void main(String[] args) {
    queue.enqueue(2);
    System.out.println(queue.peek());
    System.out.println("Size " + queue.size());
    System.out.println(queue.dequeue());
    System.out.println("Size " + queue.size());

  }
}
