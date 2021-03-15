/* Sa se construiasca clasa Dreptunghi ce are ca variabile de 
instanta private doua numere intregi a si b care reprezinta
lungimea laturilor unui dreptunghi. In aceasta clasa avem ca 
metode:
- constructorul, se face initializarile
- metoda calculPerimetru(), ce calculeaza perimetrul dreptunghiului
- metoda calculArie(), ce calculeaza aria dreptunghiului
- metoda etePatrat(), ce returneaza true daca dreptunghiul este
patrat
- metoda suntEgale(), ce are ca parametru un dreptunghi d si 
scoate ca rezultat true daca dreptunghiul curent este egal cu
dreptunghiul d.
Sa se scrie si o clasa de test pentru clasa Dreptunghi.*/

package JavaExercises.Lab2.PS5;

public class Dreptunghi {
    
    private int a;
    private int b;

    public Dreptunghi(int x, int y) {
        a = x;
        b = y;
    }

    public int calculPerimetru() {
        return 2*(a + b);
    }

    public int calculArie() {
        return a*b;
    }

    public boolean estePatrat() {
        if(a == b) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean suntEgale(Dreptunghi d) {
        if((this.a == d.a) &&(this.b == d.b)) {
            return true;
        }
        else {
            return false;
        }
    }
}
