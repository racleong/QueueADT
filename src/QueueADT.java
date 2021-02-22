public interface QueueADT<E> {
  int size();
  void enqueue(E element);
  E dequeue();
  E peek();
  boolean isEmpty();
}
