import java.util.*;
import java.util.regex.Pattern;
public class dz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.printf("Введите число строк в книге: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> linesList = new ArrayList<>(); // переименована
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите строку: ");
            linesList.add(sc.nextLine());
        }
        System.out.printf("Введите число замен продуктов: ");
        int m = sc.nextInt();
        sc.nextLine();
        List<String> product_1 = new ArrayList<>();
        List<String> product_2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            System.out.printf("Введите продукт и его замену: ");
            String input = sc.nextLine();
            int index = input.indexOf('-');
            product_1.add(input.substring(0, index).trim());
            product_2.add(input.substring(index + 1).trim());
        }
        sc.close();
        // исправлено: более точное название списка и упрощенный код преобразования
        for (int i = 0, size = product_1.size(); i < size; i++) {
            char first = Character.toUpperCase(product_1.get(i).charAt(0));
            product_1.set(i, first + product_1.get(i).substring(1));
            first = Character.toUpperCase(product_2.get(i).charAt(0));
            product_2.set(i, first + product_2.get(i).substring(1));
        }
        // исправлено: избавление от вложенного цикла
        List<String> recipesListNew = new ArrayList<>();
        for (String line : linesList) {
            for (int i = 0; i < product_1.size(); i++) {
                String pattern = "\\b" + Pattern.quote(product_1.get(i)) + "\\b";
                line = line.replaceAll(pattern, product_2.get(i));
            }
            recipesListNew.add(line);
        }
        for (String recipe : recipesListNew) {
            System.out.println(recipe);
        }
    }
}

