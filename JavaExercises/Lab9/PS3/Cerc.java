/* Sa se construiasca clasa Cerc, ce are ca variabila de instanta privata un numar
intreg r, ce reprezinta raza unui cerc. Ca metode:
- constructorul
- afisare() ce afiseaza raza cercului
Din clasa Cerc se va deriva clasa CercExtins in care se vor adauga ca variabile
de instanta x si y, coordonatele centrului, se va defini constructorul clasei si
se va redefini metoda afisare(). 
Folosind cele doua clase anterioare, sa se dezvolte o aplicatie in care se vor citi
N cercuri ce se memoreaza intr-un vector. Citirea unui obict de tipul Cerc sau
CercExtins este data de valoarea 0 sau 1 a unui numar aleator generat.
In final se vor afisa pentru fiecare cerc informatiile memorate.*/

package JavaExercises.Lab9.PS3;

public class Cerc {
    private int raza;

    public Cerc(int x) {
        raza = x;
    }

    public void afisare() {
        System.out.println("Raza: " + raza);
    }

    public int getRaza() {
        return raza;
    }
}
