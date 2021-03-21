/* Sa se cosntruiasca clasa Cerc, ce are ca variabila de instanta privata un numar 
intreg r, ce reprezinta raza unui cerc. In aceasta clasa avem ca metode:
- constructorul
- getRaza(), ce returneaza raza cercului
- calculArie(), ce returneaza aria cercului
- calculPerimetru(), ce returneaza perimetrul cercului
- suntEgale(), ce are ca parametru un Cerc c, si care returneaza true daca
cercul curent este egal cu cercul c(au aceeasi raza)
- afisare() ce afiseaza raza cercului
Din clasa Cerc se va deriva clasa CercExtins, in care se vor adauga variabilele
de instanta x si y, coordonatele centrului si se vor redefini metodele suntEgale()
(cercurile sunt egale cand au aceeasi raza si aceleasi coordonate ale centrului)
si afisare()(pe langa raza, se vor afisa si coordonatele centrului).
Sa se scrie si o clasa de test pentru clasa CercExtins.*/

package JavaExercises.Lab8.PS2;

public class Cerc {
    private int raza;

    public Cerc(int x) {
        raza = x;
    }

    public int getRaza() {
        return raza;
    }

    public double calculArie() {
        return Math.PI * raza * raza;
    }

    public double calculPerimetru() {
        return 2*Math.PI * raza;
    }

    public boolean suntegale(Cerc c) {
        if(this.raza == c.raza) {
            return true;
        }
        else {
            return false;
        }
    }

    public void afisare() {
        System.out.println("Raza: " + raza);
    }
}
