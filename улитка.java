import java.util.Scanner;

/**
 * prorgam
 */
public class улитка {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту шеста: ");
        String word = sc.nextLine();
        Integer h = Integer.parseInt(word);
        System.out.println("Введите вверх: ");
        String word_1 = sc.nextLine();
        Integer a = Integer.parseInt(word_1);
        System.out.println("Введите вниз: ");
        String word_2 = sc.nextLine();
        Integer b = Integer.parseInt(word_2);
        int start = 0;
        int count = 0;
        while(start + a < h){
            count = count + 1;
            start = start + a - b;
        }
        System.out.println(count);
           
        



    }
}