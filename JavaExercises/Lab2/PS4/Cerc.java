/* Sa se construiasca clasa Cerc ce are ca variabila de instanta
privata un numar intreg raza, ce reprezinta raza unui cerc. In
aceasta clasa avem ca metode:
- constructorul, ce face initializarea razei
- metoda set(), ce seteaza raza
- metoda get(), ce returneaza valoarea razei
- metoda calculPerimetru(), ce returneaza perimetrul cercului
- metoda calculArie(), ce returneaza aria cercului
- metoda afisare(), ce afiseaza raza
Scrieti si o clasa de test pentru clasa Cerc, in care se 
instantiaza un obiect Cerc cu raza 3 si i se calculeaza perimetrul
si aria.*/

package JavaExercises.Lab2.PS4;

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

    public double calculPerimetru() {
        return 2*Math.PI*raza;
    }

    public double calculArie() {
        return Math.PI*raza*raza;
    }

    public void afisare() {
        System.out.println("Raza: " + raza);
    }
}
