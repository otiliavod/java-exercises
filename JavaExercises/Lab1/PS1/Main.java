package JavaExercises.Lab1.PS1;

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
