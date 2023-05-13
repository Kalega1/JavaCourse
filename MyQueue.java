import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> list;

    public MyQueue() {
        list = new LinkedList<T>();
    }

    public void enqueue(T element) {
        list.addLast(element);
    }

    public T dequeue() {
        return list.pollFirst();
    }

    public T first() {
        return list.peekFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        queue.enqueue("Первый");
        queue.enqueue("Второй");
        queue.enqueue("Третий");

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}

