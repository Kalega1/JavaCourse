import java.util.Scanner;

public class шоколад {
    public static void main(String[] args) {
        System.out.println("Введите размер: ");
        Scanner sc =  new Scanner(System.in);
        String size = sc.nextLine();
        String[] words = size.split(" ");
        System.out.println(words);
        int width  = Integer.parseInt(words[0]);
        int height  = Integer.parseInt(words[1]);
        int peace  = Integer.parseInt(words[2]);
        if (peace<width*height&&((peace%height==0)||(peace%width==0))){
            System.out.println("Да");
        }else{
            System.out.println("Нет");
        }
    }


}
