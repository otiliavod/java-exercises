/* Sa se construiasca clasa Umbrela ce are ca variabila de
instanta privata un numar intreg diametru, ce reprezinta 
diametrul unei umbrele. In aceasta clasa avem ca metode:
- constructorul, ce face initializarea diametrului
- metoda set(), ce seteaza diametrul
- metoda get(), ce returneaza valoarea diametrului
- metoda esteMare(), ce returneaza true daca diametrul este 
>100
Scrieti si o clasa de test pentru clasa Umbrela in care se 
citeste de la tastatura diametrul unei umbrele, se instantiaza
un obiect Umbrela cu acest diametru si se afiseaza daca este 
mare.*/


package JavaExercises.Lab2.PS3;

public class Umbrela {

    private int diametru;

    public Umbrela(int x) {
        diametru = x;
    }

    public void set(int d) {
        diametru = d;
    }

    public int get() {
        return diametru;
    }

    public boolean esteMare() {
        final int LIMITA = 100;
        if(diametru > LIMITA) {
            return true;
        }
        else {
            return false;
        }
    }
}
