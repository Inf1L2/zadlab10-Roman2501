package src.main.java.pl.edu.ur.oopl10;
import java.util.Random;

public class Zad4 {
    public static void zad4(){

        Random random = new Random();
        int i=0;
        do {
            int a = random.nextInt(21) - 10;
            int b = random.nextInt(21) - 10;
            double wynik;

            try {
                wynik = a / b;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException (dzielenie przez zero)");
                i++;
            }
        } while(i!= 3);
    }
}