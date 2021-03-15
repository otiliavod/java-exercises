/* Folosind clasa BigInteger sa se calculeze 2^1000.*/

package JavaExercises.Lab2.PS2;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        BigInteger baza = new BigInteger("2");
        BigInteger rezultat = baza.pow(1000);
        System.out.println("Rezultat: " + rezultat);
    }
}
