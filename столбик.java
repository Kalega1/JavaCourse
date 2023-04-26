import java.util.Scanner;

public class столбик {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a:  ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("b:  ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("c:  ");
        int c = Integer.parseInt((sc.nextLine()));
        for(int i = a; i >= b; i-=c){
            System.out.println(i);

        }

    }

}
