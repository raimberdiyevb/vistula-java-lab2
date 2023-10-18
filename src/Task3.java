import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int n = random.nextInt(1,101);
            System.out.println("Random number : " + n);
            System.out.println("Is even : " + isEven(n));
            System.out.println("*".repeat(20));
        }
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
}
