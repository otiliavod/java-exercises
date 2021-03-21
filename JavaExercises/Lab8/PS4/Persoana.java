/* Sa se dezvolte clasa Persoana ce are ca variabile de instanta numele si prenumele
unei persoane si varsta ei, si ca metode:
- constructorul
- getNume() ce returneaza numele
- getPrenume() ce returneaza prenumele
- afisare() ce afiseaza informatiile despre fiecare persoana
Din clasa Persoana se va deriva clasa Student ce are in plus ca variabile de
instanta numele facultatii pe care o urmeaza si numarul matricol.In clasa 
Student se va dezvolta un nou constructor si se va redefini metoda afisare().
Se vor adauga in plus metodele:
- getFacultate()
- getNumarMatricol()
Sa se scrie apoi o aplicatie pe baza clasei Stuent in care se vor citi de la
tastatura N studenti ce se vor memora intr-un vector. Se vor afisa cati studenti
au prenumele "Ion".*/

package JavaExercises.Lab8.PS4;

public class Persoana {
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String n, String p, int v) {
        nume = n;
        prenume = p;
        varsta = v;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }
    
    public void afisare() {
        System.out.println(nume + " " + prenume + " " + varsta);
    }
}
