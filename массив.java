import java.util.Scanner;


/**
 * массив
 */
public class массив {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Размер массива: ");
        int l = Integer.parseInt(sc.nextLine());
        int[] массив = new int[l];
        int сумма_чисел = 0;
        for (int i = 0; i < l; i = i + 1){
            System.out.println("Елем:   ");
            массив[1] = Integer.parseInt(sc.nextLine());
            if(i%2==0){
                сумма_чисел = сумма_чисел + массив[i];
            }
        }
        System.out.println(сумма_чисел);
        for(int i = 0; i<l; i = i + 2){
            System.out.println(массив[i]);
        }

        
    }
}