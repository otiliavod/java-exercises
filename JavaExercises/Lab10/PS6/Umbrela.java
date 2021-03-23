/* Sa se scrie clasa Umbrela ce are ca variabile de instanta culoarea(de tip 
String) si diametrul(de tip int) unei umbrele. Ca metode avem constructorul,
setCuloare(), setDiametru(), getCuloare(), getDiametru(), esteMare() care returneaza
true daca diametrul este mai mare ca 60, si esteCuloareInchisa().
Folosind obiecte de tip Umbrela, vom face o comparatie intre clasele ArrayList,
Vector si LinkedList. Se va crea un obiect de tipul ArrayList in care se introduc
N umbrele. Se va afisa apoi aceasta colectie. In continuare aceeasi problema o 
vom implementa folosind un obiect Vector, si apoi un obiect LinkedList. Pentru
fiecare situatie de implementare vom folosi aceeasi  metoda pentru afisarea
colectiei:
void afisareColectie(List<Umbrela> l)*/

package JavaExercises.Lab10.PS6;

public class Umbrela {
    private String culoare;
    private int diametru;
    private final int MARE = 60;

    public Umbrela(String c, int d) {
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
