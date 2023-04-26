import java.util.Scanner;

public class спорт {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x:  ");
        String x = sc.nextLine();
        double дистанция = Double.parseDouble(x);
        System.out.println("y:  ");
        String y = sc.nextLine();
        double запрос = Double.parseDouble(y);
        int счетчик = 1;
        while(дистанция < запрос){
            дистанция = дистанция * 1.1;
            счетчик = счетчик + 1;
        }
        System.out.println(счетчик);



    }
    
}
