public class dz3 {
    public static void main(String[] args) {

        System.out.println();

        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true; 

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}