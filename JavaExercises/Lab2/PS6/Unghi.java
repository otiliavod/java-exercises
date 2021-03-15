/* Sa se construiasca clasa Unghi ce are ca variabila de instanta
privata un numar intreg x, masura in grade a unui si ca metode:
- constructorul
- suntComplementare(), ce are ca parametru un alt unghi u si care
returneaza true daca unghiul u este complementar cu unghiul curent
- conversieRadiani(), ce returneaza valoarea exprimata in radiani
a unghiului curent x
Sa se scrie si o clasa de test pentru clasa Unghi.*/

package JavaExercises.Lab2.PS6;

public class Unghi {
    private int x;

    public Unghi(int x) {
        this.x = x;
    }

    public boolean suntComplementare(Unghi u) {
        if(this.x + u.x == 90) {
            return true;
        }
        else {
            return false;
        }
    }

    public double conversieRadiani() {
        return (Math.PI*x) / 180;
    }
}
