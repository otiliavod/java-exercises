// Sa se calculeze valoarea constantei pi, pe baza formulei:
//pi/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9...
//Se vor lua N = 3000 de termeni in aceasta suma. Se va afisa apoi si valoarea
//mai exacta a acestei constante.

package JavaExercises.Lab1;

public class Main {
    public static void main(String[] args) {
        final int N = 3000;
        double pi = 0;
        for(int i=0; i<N; i++) {
            if(i % 2 == 0) {
                pi = pi + 4.0 / (2*i + 1);
            }
            else {
                pi = pi - 4.0 / (2*i + 1);
            }
        }
        System.out.println("Pi calculat ca suma de " + N + " termeni este " + pi );
        System.out.println("Constanta Pi din clasa Math este " + Math.PI);
    }
}
