//Крылов Алексей
import java.util.Random;

public class Main {
    private  static Random random = new Random();

    public static void main(String[] args) {
        automorphic(100000000);
    }

    //Случайное число с использованием Math.random();
    public static int random() {
        return (int) (Math.random() * 100);
    }

    //Случайное число c использованием java.util.Random
    public static int withUtilRandom() {
        return random.nextInt(100);
    }

    //Автоморфные числа.
    public static void automorphic(int number){
        for (int i = 1; i < number; i++) {
            //вычисляем количество цифр в числе i
            int length = (int) Math.ceil(Math.log10(Math.abs(i) + 0.5));
            //вычисляем автоморфные числа по формуле a2 mod 10n = a, где n -  количество цифр в числе a
            int m = (int) (Math.pow(i, 2) % Math.pow(10, length));
            if(m==i) System.out.println(m);
        }
    }
}
