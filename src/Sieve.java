import java.util.ArrayList;

/**
 * Created by mrglass on 10/3/2015.
 */
public class Sieve {

    private static int number = 0;
    ArrayList<Integer> primes = new ArrayList<>(0);

    public GetPrime(long number) {

        double reply = findPrimes(number);

    }

    private static double findPrimes(double number) {
        boolean check = false
        for (double i = Math.sqrt(number); i > 0; i--) {
            if (i % 2 == 0) break;
            if (i % 3 == 0) break;

            for (int j; j < i; j++) {
                if (i % j == 0) break;

            }
            if (number % i == 0) return number;


        }
        return 0;
    }
}
