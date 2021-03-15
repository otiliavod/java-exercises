/* Sa se construiasca clasa fractie ce are ca variabile de 
instanta private de timp int numaratorul si numitorul unei 
fractii, si ca metode:
- setNumitor(), ce seteaza valoarea numitorului fractiei cu o 
valoare data ca parametru. Se interzice valoarea 0 pentru
numitor. Metoda returneaza false daca s-a incercat setarea
numitorului la valoarea 0
- getNumarator(), care returneaza valoare numaratorului
- getNumitor(), care returneaza valoarea numitorului
- inversa(), care returneaza un obiect Fractie, inversa fractiei
curente
- suma(), ce are ca parametru un obiect Fractie f si care 
returneaza un obiect Fractie, suma fractiei curente si a fractiei
f. Fractia rezultat va fi simplificata
- afisare(), in care se afiseaza fractia curenta 
Sa se scrie si o clasa de test pentru clasa Fractie.*/

package JavaExercises.Lab2.PS7;

public class Fractie {
    private int numarator;
    private int numitor;

    public void setNumarator(int x) {
        numarator = x;
    }

    public boolean setNumitor(int x) {
        if(x == 0) {
            return false;
        }
        numitor = x;
        return true;
    }

    public int getNumarator() {
        return numarator;
    }

    public int getNumitor() {
        return numitor;
    }

    private int cmmdc(int a, int b) {
        while(a != b) {
            if(a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }

    public Fractie suma(Fractie f) {
        int numitorSuma = this.numitor * f.numitor;
        int numaratorSuma = this.numarator + f.numitor + this.numitor * f.numarator;
        
        // Simplificare fractie cu cmmdc:

        int c = cmmdc(numitorSuma, numaratorSuma);
        numaratorSuma = numaratorSuma / c;
        numitorSuma = numitorSuma / c;

        Fractie rezultat = new Fractie();
        rezultat.setNumarator(numaratorSuma);
        rezultat.setNumitor(numitorSuma);

        return rezultat;
    }

    public Fractie inversa() {
        if(numarator == 0) {
            return null; // Nu se poate inversa
        }

        Fractie rezultat = new Fractie();
        rezultat.setNumarator(numitor);
        rezultat.setNumitor(numarator);

        return rezultat;
    }

    public void afisare() {
        System.out.println(numarator + "/" + numitor);
    }
}
