/* Pentru problema 6 sa se scrie o metoda care scoate primul element din colectie.
void scoatePrimulElement(List<Umbrela> l). Se vor afisa restul elementelor din
colectie.
Pentru un N mai mare comparati timpii de executie pentru fiecare dintre cele
trei colectii.*/

package JavaExercises.Lab10.P3;

public class Umbrela_Addition {
    private String culoare;
    private int diametru;
    private final int MARE = 60;

    public Umbrela_Addition(String c, int d) {
        culoare = c;
        diametru = d;
    }

    public void setCuloare(String c) {
        culoare = c;
    }

    public void setDiametru(int d) {
        diametru = d;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getDiametru() {
        return diametru;
    }

    public boolean esteMare() {
        if(diametru >= MARE) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean esteCuloareInchisa() {
        String culoriInchise[] = {"NEGRU", "negru", "ALBASTRU", "albastru"};
        for(int i=0; i<culoriInchise.length; i++) {
            if(culoare.equals(culoriInchise[i])) {
                return true;
            }
        }
        return false;
    }

    public void afisare() {
        System.out.println("Culoare: " + culoare);
    }

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

    public long durataCalcul(int N) {
        long t1 = System.currentTimeMillis();
        calcul(N);
        long t2 = System.currentTimeMillis();
        return(t2-t1);
    }
}
