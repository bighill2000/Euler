import java.util.ArrayList;

/**
 * Created by Mr. Glass on 10/2/2015.
 */
public class Problem3 {


    public static void main(String[] args) {

        ArrayList<Integer> primeFacts = new ArrayList<>();

        int square = (int) Math.sqrt(600851475143L);
        System.out.println(square);

        for (int i = 1; i < square; i+=2) {
//            System.out.println((square % i) + "  " + i);
            if (CheckFactor(i,square)) {
//                System.out.print("add");
                primeFacts.add(i);
            }

        }
System.out.println(primeFacts.get(primeFacts.size()));

    }

    private static boolean CheckFactor(int number, int square) {

        if (number % 2 == 0) return false;
        for (int i = 3; i < square; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }


}
