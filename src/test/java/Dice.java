import java.security.SecureRandom;

/**
 * Created by ShykulaD on 04/01/2021.
 */
public class Dice {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 1000; i++) {
            ++frequency[1 + random.nextInt(6)];
        }

        for (int  j = 1; j < frequency.length; j++) {
            System.out.println(frequency[j]);
        }
    }
}
