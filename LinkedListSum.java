import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListSum {

    public static void main(String[] args) {

        // Создаем связный список
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Находим сумму всех элементов с помощью итератора
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        // Выводим результат на экран
        System.out.println("Сумма всех элементов: " + sum);
    }
}
