import java.util.Scanner;

public class dz2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:  ");
            Double num1 = sc.nextDouble();
            System.out.println("Введите знак действия: ");
            char des = sc.next().charAt(0);
            System.out.println("Введите число:  ");
            Double num2 = sc.nextDouble();

            double result = 0;

            switch (des) 
            {
                case '+':
                    result = num1 + num2;
                    break;
                
            
                case '*':
                    result = num1 * num2;
                    break;
                
                case '/':
                    result = num1 * num2;
                    break;
                
                case '-':
                    result = num1 - num2;
                    break;
                default:
                    System.out.println("вы ввели неверное действие");
            }

            System.out.println(num1 + "" + des + "" + num2 + "=" + result);

        }
}
