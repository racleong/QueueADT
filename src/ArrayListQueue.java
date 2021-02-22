import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayListQueue<E> implements QueueADT<E> {

  private List<E> queue;

  /**Constructor creates an ArrayList object and stores it to the data field.
   * */
  public ArrayListQueue() {
    queue = new ArrayList<E>();
  }

  @Override
  public int size() {
    return queue.size();
  }

  @Override
  public void enqueue(E element) {
    queue.add(element);
  }

  @Override
  public E dequeue() {
    if (isEmpty())
      throw new NoSuchElementException();
    return queue.remove(0);
    }

  @Override
  public E peek() {
    return queue.get(0);
  }

  @Override
  public boolean isEmpty() {
    return queue.isEmpty();
  }
}
