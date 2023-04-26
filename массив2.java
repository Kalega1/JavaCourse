import java.util.Scanner;

public class массив2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Размер массива:  ");
        int l = Integer.parseInt(sc.nextLine());
        int[] arr = new int[l];
        int sum_nums = 0;
        for(int i = 0; i<l; i = i + 1){
            System.out.println("Елемент массива:    ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
    }
    public static void столбик () {
        
    }
}
