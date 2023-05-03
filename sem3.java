import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class sem3 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1(){
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        sort(list);
        System.out.println(list);

    }

    static void sort(List<Integer> List){
        Collection.sort(List, Comparator.reverseOrder());

    }
    static List<Integer> createList(int capacity, int min, int max){
        List<Integer> result  = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i = i + 1) {
            result.add((int)(Math.random() * (max - min + 1) + min));
        }

    }
    static void ex0(){

    }

    }


