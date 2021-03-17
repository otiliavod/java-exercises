/* Sa se construiasca clasa Cerc, ce are ca variabila de instanta
privata un numar intreg raza, care reprezinta raza unui cerc. In
clasa avem ca metode:
- constructorul
- set() ce seteaza raza
- get() ce returneaza valoarea razei
- calculArie(), ce returneaza aria cercului
- esteEgal() ce compara cercul curent cu un alt cerc dat ca 
parametru. Returneaza true daca cele doua obiecte Cerc comparate
au aceeasi raza.
Sa se scrie apoi o clasa de test pentru clasa Cerc in care citim
N cercuri de la tastatura intr-un vector de cercuri si sa se 
afiseze daca toate cercurile sunt diferite intre ele sau nu.*/

package JavaExercises.Lab4.PS7;

public class Cerc {
    private int raza;

    public Cerc(int x) {
        raza = x;
    }

    public void set(int r) {
        raza = r;
    }

    public int get() {
        return raza;
    }

    public double calculArie() {
        return Math.PI*raza*raza;
    }

    public boolean esteEgal(Cerc c) {
        if(raza == c.raza) {
            return true;
        }
        else {
            return false;
        }
    }
}

