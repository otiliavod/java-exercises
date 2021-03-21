/* Sa se construiasca clasa ContBancar, folosita pentru a modela un cont bancar,
ce are ca variabila de instanta privata variabila suma(suma de bani din cont).
Ca metode:
- constructorul
- adauga(), ce are ca parametru un numar real x, valoare ce se adauga in cont
- extrage(), ce are ca parametru un numar real x, valoare ce se extrage din
cont si care scoate rezultat true daca e poate face extragerea(suma>=x)
- getSuma() ce returneaza valoarea variabilei private suma
- afisare() ce afiseaza valoarea sumei de bani din cont
Pe baza clasei ContBancar se va dezvolta prin mostenire clasa ContBancarExtins
in care se va adauga o noua variabila de instanta: rata dobanzii anuale si o
noua metoda, adaugaDobandaLunara() ce adauga in cont dobanda calculata dupa
trecerea unei luni. Se va redefini si metoda afisare() astefl incat sa se 
afiseze si rata dobanzii. De asemenea, se va defini si constructorul, prin care
se initializeaza suma de bani din cont si rata dobanzii.
Sa se scrie si o clasa de test pentru clasa ContBancarExtins.*/

package JavaExercises.Lab8.PS1;

public class ContBancar {
    private double suma;

    public ContBancar(double S) {
        suma = S;
    }

    public void adauga(double S) {
        suma = suma + S;
    }

    public boolean extrage(double S) {
        if(S > suma) {
            return false;
        }
        return true;
    }

    public double getSuma() {
        return suma;
    }

    public void afisare() {
        System.out.println("Suma: " + suma);
    }
}
