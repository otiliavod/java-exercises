/* Dandu-se clasa Cerc definita in problema 2, sa se deriveze din aceasta clasa
clasa CercColor, in care se va adauga ca variabila de instanta culoarea cercului
(de tip String). Se va scrie noul constructor si se vor adauga metodele getCuloare()
si setCuloare(), si se vor redefini metodele suntEgale() si afisare().
Sa se scrie si o clasa de test pentru clasa CercColor.*/

package JavaExercises.Lab8.P1;

public class CercColor extends Cerc{
    private String culoare;

    public CercColor(int x, String culoare) {
        super(x);
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean suntEgale(CercColor c) {
        if((this.getRaza() == c.getRaza()) && (this.culoare.compareTo(c.culoare) == 0)) {
            return true;
        }
        else {
            return false;
        }
    } 

    public void afisare() {
        System.out.println("Raza: " + getRaza());
        System.out.println("Culoare: " + culoare);
    }
}
