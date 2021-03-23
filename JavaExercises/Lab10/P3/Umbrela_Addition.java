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
}
