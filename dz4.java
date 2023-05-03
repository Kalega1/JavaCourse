

// import java.util.ArrayList;
// import java.util.Random;



// public class dz4 {
//     public static void main(String[] args) {
//         Random rnd = new Random();
//         ArrayList<Integer> list1 = new ArrayList<Integer>();
//         for (int i = 0; i < 10; i++) {
//             int min = -100;
//             int max = 100;
//             int val = rnd.nextInt(max - min + 1) + min;
//             list1.add(val);
//         }
//         System.out.printf("Первоначальный список %s\n", list1);
//         int i = 0;
//         while (i < list1.size()) {
//             if (list1.get(i) % 2 == 0) {
//                 list1.remove(i);
//             } else {
//                 i++;
//             }
//         }
//         System.out.printf("Список с удаленными четными числами %s", list1);
//     }
// }

// задача 2


// import java.util.ArrayList;
// import java.util.Random;
// import static java.util.Collections.max;
// import static java.util.Collections.min;

// public class dz4 {
//     public static void main(String[] args) {
//         Random rnd = new Random();
//         ArrayList<Integer> list1 = new ArrayList<Integer>();
//         for (int i = 0; i < 10; i++) {
//             int min = -100;
//             int max = 100;
//             int val = rnd.nextInt(max - min + 1) + min;
//             list1.add(val);
//         }
//         System.out.printf("Первоначальный список %s\n", list1);
//         int maxVal = max(list1);
//         int minVal = min(list1);
//         int maxItem = list1.get(0);
//         int minItem = list1.get(0);
//         int sumItems = 0;
//         for (int item : list1) {
//             if (item > maxItem) {
//                 maxItem = item;
//             }
//             if (item < minItem) {
//                 minItem = item;
//             }
//             sumItems += item;
//         }
//         float average = (float)sumItems/list1.size();
//         System.out.printf("Максимальный элемент при помощи max %s\n", maxVal);
//         System.out.printf("Максимальный элемент %s\n", maxItem);
//         System.out.printf("Минимальный элемент при помощи min %s\n", minVal);
//         System.out.printf("Минимальный элемент %s\n", minItem);
//         System.out.printf("Сумма элементов %s\n", sumItems);
//         System.out.printf("Среднее арифметическое %s\n", average);
//     }
// }

import java.util.HashMap;

public class dz4 {
    public static void main(String[] args) {
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Юпитер", "Земля", "Венера", "Меркурий", "Уран"};

        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        for (String planet : planets) {
            if (counts.containsKey(planet)) {
                counts.put(planet, counts.get(planet) + 1);
            } else {
                counts.put(planet, 1);
            }
        }

        for (HashMap.Entry<String, Integer> entry : counts.entrySet()) {
            String planet = entry.getKey();
            int count = entry.getValue();
            System.out.println(planet + ": " + count);
        }
    }
}

