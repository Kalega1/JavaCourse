import java.util.LinkedList;
import java.util.Iterator;

public class MyLinkedListUtils<T> implements Iterable<T>{
    private LinkedList<T> list = new LinkedList<>();

    public void add(T element) {
        list.add(element);
    }

    public LinkedList<T> reverseLinkedList() {
        LinkedList<T> reversedList = new LinkedList<>();
        Iterator<T> it = list.descendingIterator();
        while(it.hasNext()) {
            reversedList.add(it.next());
        }
        return reversedList;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : this) {
            sb.append(t).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        MyLinkedListUtils<Integer> utils = new MyLinkedListUtils<>();
        utils.add(1);
        utils.add(2);
        utils.add(3);

        MyLinkedListUtils<Integer> reversedUtils = new MyLinkedListUtils<>();
        reversedUtils.list = utils.reverseLinkedList();


        System.out.println("Нормальный список: " + utils.toString());
        System.out.println("Перевернутый список: " + reversedUtils.toString());
    }
}
