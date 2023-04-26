
import java.util.Scanner;

public class факториал {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("n:  ");
        String факториал = sc.nextLine();
        int n = Integer.parseInt(факториал);
        var res = Factor(n);
        System.out.println(res);
    } 
        static double Factor(int n){
            
            if(n==1)return 1;
            return n * Factor(n-1);
        }
    }

