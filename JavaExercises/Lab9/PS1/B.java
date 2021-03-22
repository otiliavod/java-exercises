package JavaExercises.Lab9.PS1;

public class B extends A{
    public void calcul(int N) {
        long rezultat;
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                for(int k=1; k<=N; k++) {
                    rezultat = i*j*k;
                }
            }
        }
    }
}
