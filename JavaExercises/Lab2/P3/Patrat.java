/* Sa se scrie clasa Patrat ce are ca variabila de instanta latura
patratului si ca metode:
- constructorul, ce face initializarile
- calculPerimetru(), ce returneaza perimetrul patratului
- calculArie(), ce returneaza aria patratului
- afisare(), ce afiseaza lungimea laturii patratului
- suntEgale, ce are ca parametru un patrat p si scoate ca rezultat
true daca patratul curent este egal cu patratul p
Scrieti si o clasa de test pentru clasa Patrat.*/

package JavaExercises.Lab2.P3;

public class Patrat {
    private int a;

    public Patrat(int x) {
        a = x;
    }

    public int calculPerimetru() {
        return 4 * a;
    }

    public int calculArie() {
        return a * a;
    }

    public void afisare() {
        System.out.println("Latura = " + a);
    }

    public boolean suntEgale(Patrat p) {
        if(this.a == p.a) {
            return true;
        }
        else {
            return false;
        }
    }
}
